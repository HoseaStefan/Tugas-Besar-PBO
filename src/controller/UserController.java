package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;
import model.Nasabah;
import model.User;
import model.UserType;
import model.CurrentUser;

public class UserController {

    private static UserController instance;
    static DatabaseHandler conn = new DatabaseHandler();

    public static UserController getInstance() {
        if (instance == null) {
            synchronized (UserController.class) {
                if (instance == null) {
                    instance = new UserController();
                }
            }
        }
        return instance;
    }

    public static User verifyUser(String username, String password) {
        try {
            conn.connect();
            String query = "SELECT * FROM users WHERE (username = ? OR email = ?) AND password = ?";
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, username);
            stmt.setString(3, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String userType = rs.getString("user_type");
                String userId = rs.getString("user_id");

                User loggedInUser = null;
                Nasabah loggedInNasabah = null;
                Admin loggedInAdmin = null;
                if ("NASABAH".equals(userType)) {
                    loggedInUser = fetchNasabah(userId, rs);
                    loggedInNasabah = fetchNasabah(userId, rs);
                } else if ("ADMIN".equals(userType)) {
                    loggedInUser = fetchAdmin(userId, rs);
                    loggedInAdmin = fetchAdmin(userId, rs);
                }

                if (loggedInUser != null) {
                    CurrentUser.getInstance().setUser(loggedInUser);
                    CurrentUser.getInstance().setNasabah(loggedInNasabah);
                    CurrentUser.getInstance().setAdmin(loggedInAdmin);
                }
                return loggedInUser;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Nasabah fetchNasabah(String userId, ResultSet userRs) throws SQLException {
        return new Nasabah(
                userId,
                userRs.getString("name"),
                userRs.getString("username"),
                userRs.getString("email"),
                UserType.NASABAH,
                userRs.getString("full_name"),
                userRs.getInt("pin"),
                userRs.getInt("nomor_rekening"),
                userRs.getDouble("saldo"),
                null);
    }

    public static Admin fetchAdmin(String userId, ResultSet userRs) throws SQLException {
        return new Admin(
                userId,
                userRs.getString("name"),
                userRs.getString("username"),
                userRs.getString("email"),
                UserType.ADMIN);
    }

    public static boolean verifyRegister(String username, String email, String password) {
        try {
            conn.connect();

            String checkQuery = "SELECT * FROM users WHERE username = ? OR email = ?";
            PreparedStatement checkStmt = conn.con.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            checkStmt.setString(2, email);

            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                return false;
            }

            String insertQuery = "INSERT INTO users (user_id, name, username, email, user_type, password, saldo, nomor_rekening) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStmt = conn.con.prepareStatement(insertQuery);
            String userUniqueId = generateUniqueId();
            insertStmt.setString(1, "USR" + userUniqueId);
            insertStmt.setString(2, username);
            insertStmt.setString(3, username);
            insertStmt.setString(4, email);
            insertStmt.setString(5, "NASABAH");
            insertStmt.setString(6, password);
            insertStmt.setDouble(7, 0);
            insertStmt.setString(8, userUniqueId);

            int rowsInserted = insertStmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String generateUniqueId() {
        return "" + (System.currentTimeMillis() % 1000000);
    }
}
