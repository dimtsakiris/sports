package com.example.roomtest.matches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;
import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.sport.Sport;
import com.google.firebase.firestore.FirebaseFirestore;

import androidx.fragment.app.Fragment;

public class InsertJavelin extends Fragment {
    EditText codeSport,athleteName1,codeAthlete1,score1,athleteName2,codeAthlete2,score2,date,city,country;
    Button btn;
    public static FirebaseFirestore db;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.javelin,container,false);

        codeSport=view.findViewById(R.id.CodeMatchSport);
        athleteName1=view.findViewById(R.id.AthleteName1);
        codeAthlete1=view.findViewById(R.id.CodeAthlete1);
        score1=view.findViewById(R.id.Score1);
        athleteName2=view.findViewById(R.id.AthleteName2);
        codeAthlete2=view.findViewById(R.id.CodeAthlete2);
        score2=view.findViewById(R.id.Score2);
        date=view.findViewById(R.id.DateMatch);
        city=view.findViewById(R.id.CityMatch);
        country=view.findViewById(R.id.CountryMatch);
        btn=view.findViewById(R.id.buttonMatch);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int athleteId= 0;
                try {
                    athleteId = Integer.parseInt(codeAthlete1.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int codesport=Integer.parseInt(codeSport.getText().toString());
                String name1=athleteName1.getText().toString();
                int m1=Integer.parseInt(score1.getText().toString());
                String name2=athleteName2.getText().toString();
                int aid2=Integer.parseInt(codeAthlete2.getText().toString());
                int m2=Integer.parseInt(score2.getText().toString());
                String dateString=date.getText().toString();
                String cityString=city.getText().toString();
                String countryString=country.getText().toString();

                Sport sport = MainActivity.myDatabase.mydaotemp().findSportById(codesport);
                Athlete athlete=MainActivity.myDatabase.mydaotemp().findAthleteById(athleteId);
                Athlete athlete2=MainActivity.myDatabase.mydaotemp().findAthleteById(aid2);


                db = FirebaseFirestore.getInstance();
                try{
                    Javelin tennis = new Javelin(dateString,cityString,countryString,sport,athlete,athlete2,m1,m2,athlete,athlete2);
                    db.collection("javelin").document("" +athlete.getName() +athlete2.getName()).set(tennis).addOnCompleteListener((task)-> {
                        Toast.makeText(getActivity(),"Added Record",Toast.LENGTH_LONG).show();})
                            .addOnFailureListener((e)->{Toast.makeText(getActivity(),"Fail",Toast.LENGTH_LONG).show();});


                }catch (Exception e){
                    String message = e.getMessage();
                    Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
                }

                codeSport.setText("");
                athleteName1.setText("");
                codeAthlete1.setText("");
                score1.setText("");
                athleteName2.setText("");
                codeAthlete2.setText("");
                score2.setText("");
                date.setText("");
                city.setText("");
                country.setText("");


            }

        });



        return view;


        }
    }

