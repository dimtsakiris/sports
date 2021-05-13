package com.example.roomtest.matches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.roomtest.R;
import com.google.firebase.firestore.FirebaseFirestore;

import androidx.fragment.app.Fragment;

public class InsertMatches extends Fragment {
EditText csport,tname1,cteam1,score1,tname2,cteam2,score2,date,city,country;
Button btn;
public static FirebaseFirestore db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.team_match,container,false);
        csport=view.findViewById(R.id.CodeMatchSport);
        tname1=view.findViewById(R.id.TeamName1);
        cteam1=view.findViewById(R.id.CodeTeamName1);
        score1=view.findViewById(R.id.ScoreTeam1);
        tname2=view.findViewById(R.id.TeamName2);
        cteam2=view.findViewById(R.id.CodeTeam2);
        score2=view.findViewById(R.id.ScoreTeam2);
        date=view.findViewById(R.id.DateMatch);
        city=view.findViewById(R.id.CityMatch);
        country=view.findViewById(R.id.CountryMatch);
        btn=view.findViewById(R.id.buttonMatch);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {




            }

        });
        return view;

     }
    }

