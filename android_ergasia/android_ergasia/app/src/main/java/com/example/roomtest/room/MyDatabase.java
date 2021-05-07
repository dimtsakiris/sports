package com.example.roomtest.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.room.mydao;
import com.example.roomtest.sport.Sport;
import com.example.roomtest.team.Team;

@Database(entities = {Sport.class, Athlete.class, Team.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract mydao mydaotemp();
}
