package abstraction.tabungan;

public class BluSaving {
    private String namaTabunganSaving;
    private double saldo;
    private double target;

    public BluSaving(String namaTabunganSaving, double saldo, double target) {
        this.namaTabunganSaving = namaTabunganSaving;
        this.saldo = saldo;
        this.target = target;
    }

    public String getNamaTabunganSaving() {
        return namaTabunganSaving;
    }

    public void setNamaTabunganSaving(String namaTabunganSaving) {
        this.namaTabunganSaving = namaTabunganSaving;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

}
