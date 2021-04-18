package com.example.roomtest;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "omada_table",primaryKeys = {"code_team","athlhma_kwdikos"},
        foreignKeys = {@ForeignKey(entity = athlhma.class,parentColumns = "kwdikos",childColumns = "athlhma_kwdikos",onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class omada {
    @ColumnInfo(name="code_team")@NonNull
    private int kwdikos_omadas;

    @ColumnInfo(name="athlhma_kwdikos") @NonNull
    private int kwdikos_athlhmatos;

    @ColumnInfo(name="name_omadas")
    private String onoma_omadas;

    @ColumnInfo(name="name_ghpedou")
    private String onoma_ghpedou;

    @ColumnInfo(name="city_omadas")
    private String poli_omadas;

    @ColumnInfo(name = "country_omadas")
    private String xwra_omadas;

    @ColumnInfo(name="year_idrisis")
    private String etos_idrisis;

    public int getKwdikos_omadas() {
        return kwdikos_omadas;
    }

    public void setKwdikos_omadas(int kwdikos_omadas) {
        this.kwdikos_omadas = kwdikos_omadas;
    }

    public int getKwdikos_athlhmatos() {
        return kwdikos_athlhmatos;
    }

    public void setKwdikos_athlhmatos(int kwdikos_athlhmatos) {
        this.kwdikos_athlhmatos = kwdikos_athlhmatos;
    }

    public String getOnoma_omadas() {
        return onoma_omadas;
    }

    public void setOnoma_omadas(String onoma_omadas) {
        this.onoma_omadas = onoma_omadas;
    }

    public String getOnoma_ghpedou() {
        return onoma_ghpedou;
    }

    public void setOnoma_ghpedou(String onoma_ghpedou) {
        this.onoma_ghpedou = onoma_ghpedou;
    }

    public String getPoli_omadas() {
        return poli_omadas;
    }

    public void setPoli_omadas(String poli_omadas) {
        this.poli_omadas = poli_omadas;
    }

    public String getXwra_omadas() {
        return xwra_omadas;
    }

    public void setXwra_omadas(String xwra_omadas) {
        this.xwra_omadas = xwra_omadas;
    }

    public String getEtos_idrisis() {
        return etos_idrisis;
    }

    public void setEtos_idrisis(String etos_idrisis) {
        this.etos_idrisis = etos_idrisis;
    }
}
