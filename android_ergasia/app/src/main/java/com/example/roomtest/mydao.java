package com.example.roomtest;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface mydao {

    @Insert
    void insertSport(Sport Sport);

    @Insert
    void insertAthlete(Athlete athlete);

    @Query("SELECT * FROM athlete")
    List<Athlete> findAllAthletes();

    @Insert
    void insert_omada(Team Team);

    @Delete
    void delete_athlhma(Sport Sport);

    @Delete
    void delete_atlhths(Athlete athlete);

    @Delete
    void delete_omada(Team Team);

    @Update
    void update_athlhma(Sport Sport);

    @Update
    void update_athlhths(Athlete athlete);

    @Update
    void update_omada(Team Team);

}
