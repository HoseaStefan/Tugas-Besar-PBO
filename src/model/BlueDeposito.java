package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class BlueDeposito extends Tabungan {
    private String tabungan_ID;
    private DepositoType depositoType;
    private Double saldoAkhir;
    private Timestamp endDate;
    private Boolean complete;

    public BlueDeposito(String tabungan_id, String user_id, TabunganType tabunganType, Timestamp start_date,
            String tabungan_ID2, DepositoType depositoType, Double saldoAkhir, Timestamp endDate, Boolean complete) {
        super(tabungan_id, user_id, tabunganType, start_date);
        tabungan_ID = tabungan_ID2;
        this.depositoType = depositoType;
        this.saldoAkhir = saldoAkhir;
        this.endDate = endDate;
        this.complete = complete;
    }

    public String getTabungan_ID() {
        return tabungan_ID;
    }

    public void setTabungan_ID(String tabungan_ID) {
        this.tabungan_ID = tabungan_ID;
    }

    public DepositoType getDepositoType() {
        return depositoType;
    }

    public void setDepositoType(DepositoType depositoType) {
        this.depositoType = depositoType;
    }

    public Double getSaldoAkhir() {
        return saldoAkhir;
    }

    public void setSaldoAkhir(Double saldoAkhir) {
        this.saldoAkhir = saldoAkhir;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

}