package com.example.roomtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDatabase= Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userBd").allowMainThreadQueries().build();
    }
}