package com.example.roomtest;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {athlhma.class,athlhths.class,omada.class},version=1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract mydao mydaotemp();
}
