package com.example.roomtest.athlete;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.example.roomtest.sport.Sport;

@Entity(tableName = "athlete", primaryKeys = {"id", "id_sport"},
        foreignKeys = {@ForeignKey(entity = Sport.class, parentColumns = "id", childColumns = "id_sport", onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)})
public class Athlete {

    @ColumnInfo(name = "id")
    @NonNull
    private int id;

    @ColumnInfo(name = "id_sport")
    @NonNull
    private int idSport;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "surname")
    private String surname;

    @ColumnInfo(name = "city")
    private String city;

    @ColumnInfo(name = "country")
    private String country;

    @ColumnInfo(name = "birthday")
    private String birthday;

    public Athlete(int id, int idSport, String name, String surname, String city, String country, String birthday) {
        this.id = id;
        this.idSport = idSport;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.country = country;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public int getIdSport() {
        return idSport;
    }

    public String getName() {
        return name;
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", idSport=" + idSport +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
