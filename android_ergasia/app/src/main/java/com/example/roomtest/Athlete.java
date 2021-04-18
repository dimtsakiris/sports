package com.example.roomtest;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "athlete_table",primaryKeys = {"code_athlete","id_sport"},
foreignKeys = {@ForeignKey(entity = Sport.class,parentColumns = "id",childColumns = "id_sport",onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class Athlete {
@ColumnInfo(name="id_athlete")@NonNull
    private int id_athlete;

@ColumnInfo(name="id_sport") @NonNull
private int id_sport;

@ColumnInfo(name="name_athlete")
private String name_athlete;

@ColumnInfo(name="surname_athlete")
private String surname_athlete;

@ColumnInfo(name="city_athlete")
private String city;

@ColumnInfo(name="country_athlete")
private String country;

@ColumnInfo(name = "date_athlete")
private String birthday;

    public int getId_athlete() {
        return id_athlete;
    }

    public void setId_athlete(int id_athlete) {
        this.id_athlete = id_athlete;
    }

    public int getId_sport() {
        return id_sport;
    }

    public void setId_sport(int id_sport) {
        this.id_sport = id_sport;
    }

    public String getName_athlete() {
        return name_athlete;
    }

    public void setName_athlete(String name_athlete) {
        this.name_athlete = name_athlete;
    }

    public String getSurname_athlete() {
        return surname_athlete;
    }

    public void setSurname_athlete(String surname_athlete) {
        this.surname_athlete = surname_athlete;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
