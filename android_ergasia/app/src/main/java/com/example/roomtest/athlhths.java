package com.example.roomtest;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "athlhths_table",primaryKeys = {"code_athlhth","athlhma_kwdikos"},
foreignKeys = {@ForeignKey(entity = Sport.class,parentColumns = "kwdikos",childColumns = "athlhma_kwdikos",onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class athlhths {
@ColumnInfo(name="code_athlhth")@NonNull
    private int kwdikos_athlhth;

@ColumnInfo(name="athlhma_kwdikos") @NonNull
private int kwdikos_athlhmatos;

@ColumnInfo(name="name_athlhth")
private String onoma_athlhth;

@ColumnInfo(name="surname_athlhth")
private String epwnymo_athlhth;

@ColumnInfo(name="city_athlhth")
private String poli;

@ColumnInfo(name="country_athlhth")
private String xwra;

@ColumnInfo(name = "date_athlhth")
private String etos_gennhshs;

    public int getKwdikos_athlhth() {
        return kwdikos_athlhth;
    }

    public void setKwdikos_athlhth(int kwdikos_athlhth) {
        this.kwdikos_athlhth = kwdikos_athlhth;
    }

    public int getKwdikos_athlhmatos() {
        return kwdikos_athlhmatos;
    }

    public void setKwdikos_athlhmatos(int kwdikos_athlhmatos) {
        this.kwdikos_athlhmatos = kwdikos_athlhmatos;
    }

    public String getOnoma_athlhth() {
        return onoma_athlhth;
    }

    public void setOnoma_athlhth(String onoma_athlhth) {
        this.onoma_athlhth = onoma_athlhth;
    }

    public String getEpwnymo_athlhth() {
        return epwnymo_athlhth;
    }

    public void setEpwnymo_athlhth(String epwnymo_athlhth) {
        this.epwnymo_athlhth = epwnymo_athlhth;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public String getXwra() {
        return xwra;
    }

    public void setXwra(String xwra) {
        this.xwra = xwra;
    }

    public String getEtos_gennhshs() {
        return etos_gennhshs;
    }

    public void setEtos_gennhshs(String etos_gennhshs) {
        this.etos_gennhshs = etos_gennhshs;
    }
}
