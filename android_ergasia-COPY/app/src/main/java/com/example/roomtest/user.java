package com.example.roomtest;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "users") //to onoma tou table pou tha vaw egw xwris na fainetai to alhthino
public class user {
    @PrimaryKey //vazw primary key to id
    @ColumnInfo(name="id_sport1")
    private int id_sport;


    @ColumnInfo(name="users_name") //krivw to kanoniko onoma tou name kai xrhsimopoiw users_name sto code

    private String name;

    @ColumnInfo(name="users_surname")
    private String surname;


}
