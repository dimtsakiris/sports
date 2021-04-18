package com.example.roomtest;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sport")
public class Sport {

    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "kind")
    private String kind;

    @ColumnInfo(name = "gender")
    private String gender;

    public Sport(int id, String name, String kind, String gender) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getGender() {
        return gender;
    }
}
