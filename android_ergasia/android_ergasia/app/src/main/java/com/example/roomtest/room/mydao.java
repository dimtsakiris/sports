package com.example.roomtest.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.sport.Sport;
import com.example.roomtest.team.Team;

import java.util.List;

@Dao
public interface mydao {

    @Insert
    void insertSport(Sport Sport);

    @Insert
    void insertAthlete(Athlete athlete);

    @Query("SELECT * FROM team where id = :id")
    Team findTeamById(Integer id);


    @Query("SELECT * FROM athlete where id = :id")
    Athlete findAthleteById(Integer id);

    @Query("SELECT * FROM sport WHERE id = :id")
    Sport findSportById(Integer id);

    @Query("SELECT * FROM athlete")
    List<Athlete> findAllAthletes();
    @Query("SELECT * FROM sport")
    List<Sport> findAllSports();
    @Query("SELECT * FROM team")
    List<Team> findAllTeams();

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
