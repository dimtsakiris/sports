package com.example.roomtest;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface mydao {
    @Insert
    public void insert_athlhma(Sport Sport);
    @Insert
    public void insert_athlhths(Athlete athlete);
    @Insert
    public void insert_omada(Team Team);

    @Delete
    public void delete_athlhma(Sport Sport);

    @Delete
    public void delete_atlhths(Athlete athlete);
    @Delete
    public void delete_omada(Team Team);

    @Update
    public void update_athlhma(Sport Sport);

    @Update
    public void update_athlhths(Athlete athlete);
    @Update
    public void update_omada(Team Team);

    @Query("select * from users")
    public List<user> getusers();


}
