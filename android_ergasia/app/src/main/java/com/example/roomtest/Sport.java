package com.example.roomtest;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "sport_table")
public class Sport {
    @PrimaryKey
    @ColumnInfo(name="id")
    private int id_sport;

    @ColumnInfo(name="name_sport")
    private String name_sport;

    @ColumnInfo(name="kind")
    private String kind_sport;

    @ColumnInfo(name="gender")
    private String athlete_gender;

    public int getId_sport() {
        return id_sport;
    }

    public void setId_sport(int id_sport) {
        this.id_sport = id_sport;
    }

    public String getName_sport() {
        return name_sport;
    }

    public void setName_sport(String name_sport) {
        this.name_sport = name_sport;
    }

    public String getKind_sport() {
        return kind_sport;
    }

    public void setKind_sport(String kind_sport) {
        this.kind_sport = kind_sport;
    }

    public String getAthlete_gender() {
        return athlete_gender;
    }

    public void setAthlete_gender(String athlete_gender) {
        this.athlete_gender = athlete_gender;
    }
}
