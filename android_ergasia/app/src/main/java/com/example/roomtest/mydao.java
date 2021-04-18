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
    public void insert_athlhma(athlhma athlhma);
    @Insert
    public void insert_athlhths(athlhths athlhths);
    @Insert
    public void insert_omada(omada omada);

    @Delete
    public void delete_athlhma(athlhma athlhma);

    @Delete
    public void delete_atlhths(athlhths athlhths);
    @Delete
    public void delete_omada(omada omada);

    @Update
    public void update_athlhma(athlhma athlhma);

    @Update
    public void update_athlhths(athlhths athlhths);
    @Update
    public void update_omada(omada omada);

    @Query("select * from users")
    public List<user> getusers();


}
