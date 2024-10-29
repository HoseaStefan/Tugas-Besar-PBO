package abstraction.user;

import enums.UserType;

public class Admin {
    private int adminID;
    private String namaAdmin;
    private String email;
    private String password;
    private UserType userType;

    public Admin(int adminID, String namaAdmin, String email, String password, UserType userType) {
        this.adminID = adminID;
        this.namaAdmin = namaAdmin;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
