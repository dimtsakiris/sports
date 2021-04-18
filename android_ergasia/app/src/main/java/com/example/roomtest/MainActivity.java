package com.example.roomtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {

    public static MyDatabase myDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDatabase = Room.databaseBuilder(getApplicationContext(), MyDatabase.class, "userBd").allowMainThreadQueries().build();
//        myDatabase.mydaotemp().insertSport(new Sport(1, "Football", "Team", "Male"));
//        myDatabase.mydaotemp().insertAthlete(new Athlete(1, 1, "tets", "tets", "tets", "tets", "tets"));

        System.out.println(myDatabase.mydaotemp().findAllAthletes());


    }
}