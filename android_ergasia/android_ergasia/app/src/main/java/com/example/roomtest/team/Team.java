package com.example.roomtest.team;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.example.roomtest.sport.Sport;

@Entity(tableName = "team",primaryKeys = {"id_team","id_sport"},
        foreignKeys = {@ForeignKey(entity = Sport.class,parentColumns = "id",childColumns = "id_sport",onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class Team {
    @ColumnInfo(name="id_team")@NonNull
    private int id;

    @ColumnInfo(name="id_sport") @NonNull
    private int idSport;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name="stadium")
    private String stadium;

    @ColumnInfo(name="city")
    private String city;

    @ColumnInfo(name = "country")
    private String country;

    @ColumnInfo(name="establishment")
    private int establishment;

    public int getId() {
        return id;
    }
    
    public int getIdSport() {
        return idSport;
    }
    
    public String getName() {
        return name;
    }
    
    public String getStadium() {
        return stadium;
    }
    
    public String getCity() { return city; }
    
    public String getCountry() {
        return country;
    }
    
    public int getEstablishment() {
        return establishment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdSport(int idSport) {
        this.idSport = idSport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEstablishment(int establishment) {
        this.establishment = establishment;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", idSport=" + idSport +
                ", name='" + name + '\'' +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", establishment='" + establishment + '\'' +
                '}';
    }
}
