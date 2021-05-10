package com.example.roomtest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.NavController;

import com.example.roomtest.room.MyDatabase;
import com.example.roomtest.sport.SportFragment;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static MyDatabase myDatabase;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDatabase = Room.databaseBuilder(getApplicationContext(), MyDatabase.class, "userBd").allowMainThreadQueries().build();
//        myDatabase.mydaotemp().insertSport(new Sport(1, "Football", "Team", "Male"));
//        myDatabase.mydaotemp().insertAthlete(new Athlete(1, 1, "tets", "tets", "tets", "tets", "tets"));

        System.out.println(myDatabase.mydaotemp().findAllAthletes());

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_matches, R.id.nav_sport, R.id.nav_athletes, R.id.nav_teams)
                .setOpenableLayout(drawer)
                .build();


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        fragmentManager = getSupportFragmentManager();


        if(findViewById(R.id.container)!=null){
            if(savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.container, new SportFragment()).commit();
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}