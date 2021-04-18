package com.example.roomtest;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "athlhma_table")
public class athlhma {
    @PrimaryKey
    @ColumnInfo(name="kwdikos")
    private int kwdikos_athlhmatos;

    @ColumnInfo(name="name_athlhmatos")
    private String onoma_athlhmatos;

    @ColumnInfo(name="eidos")
    private String eidos_athlhmatos;

    @ColumnInfo(name="gender")
    private String fyllo;

    public int getKwdikos_athlhmatos() {
        return kwdikos_athlhmatos;
    }

    public void setKwdikos_athlhmatos(int kwdikos_athlhmatos) {
        this.kwdikos_athlhmatos = kwdikos_athlhmatos;
    }

    public String getOnoma_athlhmatos() {
        return onoma_athlhmatos;
    }

    public void setOnoma_athlhmatos(String onoma_athlhmatos) {
        this.onoma_athlhmatos = onoma_athlhmatos;
    }

    public String getEidos_athlhmatos() {
        return eidos_athlhmatos;
    }

    public void setEidos_athlhmatos(String eidos_athlhmatos) {
        this.eidos_athlhmatos = eidos_athlhmatos;
    }

    public String getFyllo() {
        return fyllo;
    }

    public void setFyllo(String fyllo) {
        this.fyllo = fyllo;
    }
}
