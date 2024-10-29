package abstraction.user;

import abstraction.loyalty.Loyalty;
import abstraction.tabungan.*;
import enums.*;

public abstract class User {
    private int userID;
    private String fullName;
    private String name;
    private String password;
    private String phoneNumber;
    private String email;
    private Loyalty loyalty;
    private double saldo;
    private boolean blackList;
    private BluSaving[] userSavings;
    private BluGether[] userGether;
    private BluDeposit userDeposit;
    private TipeUser userType;

    public User() {
    }

    public User(int userID, String fullName, String name, String password, String phoneNumber,
                String email, Loyalty loyalty, double saldo, boolean blackList,
                BluSaving[] userSavings, BluGether[] userGether, BluDeposit userDeposit, UserType userType) {
        this.userID = userID;
        this.fullName = fullName;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.loyalty = loyalty;
        this.saldo = saldo;
        this.blackList = blackList;
        this.userSavings = userSavings;
        this.userGether = userGether;
        this.userDeposit = userDeposit;
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Loyalty getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Loyalty loyalty) {
        this.loyalty = loyalty;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isBlackList() {
        return blackList;
    }

    public void setBlackList(boolean blackList) {
        this.blackList = blackList;
    }

    public BluSaving[] getUserSavings() {
        return userSavings;
    }

    public void setUserSavings(BluSaving[] userSavings) {
        this.userSavings = userSavings;
    }

    public BluGether[] getUserGether() {
        return userGether;
    }

    public void setUserGether(BluGether[] userGether) {
        this.userGether = userGether;
    }

    public BluDeposit getUserDeposit() {
        return userDeposit;
    }

    public void setUserDeposit(BluDeposit userDeposit) {
        this.userDeposit = userDeposit;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
