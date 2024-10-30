package abstraction.tabungan;

import abstraction.user.*;

public class BluGether {
    private User[] users;
    private String namaTabunganGether;
    private double totalSaldo;
    private double target;

    public BluGether(User[] users, String namaTabunganGether, double totalSaldo, double target) {
        this.users = users;
        this.namaTabunganGether = namaTabunganGether;
        this.totalSaldo = totalSaldo;
        this.target = target;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public String getNamaTabunganGether() {
        return namaTabunganGether;
    }

    public void setNamaTabunganGether(String namaTabunganGether) {
        this.namaTabunganGether = namaTabunganGether;
    }

    public double getTotalSaldo() {
        return totalSaldo;
    }

    public void setTotalSaldo(double totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

}
