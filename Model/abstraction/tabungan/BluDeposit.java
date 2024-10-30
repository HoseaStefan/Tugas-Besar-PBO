package abstraction.tabungan;

public class BluDeposit {
    private double saldoAwal;
    private double saldoAkhir;
    private String tanggalMasuk;
    private String tanggalKeluar;

    public BluDeposit(double saldoAwal, double saldoAkhir, String tanggalMasuk, String tanggalKeluar) {
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
    }

    public double getSaldoAwal() {
        return saldoAwal;
    }

    public void setSaldoAwal(double saldoAwal) {
        this.saldoAwal = saldoAwal;
    }

    public double getSaldoAkhir() {
        return saldoAkhir;
    }

    public void setSaldoAkhir(double saldoAkhir) {
        this.saldoAkhir = saldoAkhir;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

}