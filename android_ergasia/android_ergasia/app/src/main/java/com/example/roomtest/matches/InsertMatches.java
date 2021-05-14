package com.example.roomtest.matches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roomtest.R;
import com.example.roomtest.team.Team;
import com.google.firebase.firestore.DocumentReference;
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
                int Var_teamId= 0;
                try {
                    Var_teamId = Integer.parseInt(cteam1.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int codesport=Integer.parseInt(csport.getText().toString());
                String name1=tname1.getText().toString();
                int s1=Integer.parseInt(score1.getText().toString());
                String name2=tname2.getText().toString();
                int tid2=Integer.parseInt(cteam2.getText().toString());
                int s2=Integer.parseInt(score2.getText().toString());
                int Date=Integer.parseInt(date.getText().toString());
                String ci=city.getText().toString();
                String Country=country.getText().toString();



                try{
                   Team team=new Team();
                   team.setId(codesport);
                   team.setName(name1);
                   team.setName(name2);
                   team.setScore1(s1);
                   team.setId(tid2);
                   team.setScore2(s2);
                   team.setEstablishment(Date);
                   team.setStadium(ci);
                   team.setCountry(Country);

                    db.document(""+Var_teamId).set(team).addOnCompleteListener((task)-> {
                        Toast.makeText(getActivity(),"Added Record",Toast.LENGTH_LONG).show();})
                            .addOnFailureListener((e)->{Toast.makeText(getActivity(),"Fail",Toast.LENGTH_LONG).show();});


                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
                }

                csport.setText("");
                tname1.setText("");
                cteam1.setText("");
                score1.setText("");
                tname2.setText("");
                cteam2.setText("");
                score2.setText("");
                date.setText("");
                city.setText("");
                country.setText("");


            }

        });
        return view;

     }
    }

