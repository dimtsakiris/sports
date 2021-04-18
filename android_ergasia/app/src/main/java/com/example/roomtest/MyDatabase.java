package com.example.roomtest;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Sport.class,athlhths.class, Team.class},version=1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract mydao mydaotemp();
}
