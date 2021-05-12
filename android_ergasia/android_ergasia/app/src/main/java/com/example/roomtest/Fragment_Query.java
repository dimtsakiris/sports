package com.example.roomtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.sport.Sport;
import com.example.roomtest.team.Team;

import java.util.List;

import androidx.fragment.app.Fragment;

public class Fragment_Query extends Fragment {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    TextView querytextView, querytextresult;
    Button bnqueryrun;
    int test;

    public Fragment_Query() {

        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_query,container,false);
        final String[] queryArray=getResources().getStringArray(R.array.queries_description_array);
        querytextView =view.findViewById(R.id.txtquery);
        spinner = view.findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(getContext(), R.array.query_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                querytextView.setText(queryArray[position]);
                test = position+1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        querytextresult = view.findViewById(R.id.txtqueryresult);
        bnqueryrun = view.findViewById(R.id.queryrun);

        bnqueryrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                querytextresult.setText("test" + test);
                String result ="";
                switch (test){
                    case 1:
                        List<Athlete> athletes = MainActivity.myDatabase.mydaotemp().findAllAthletes();
                        for (Athlete i: athletes) {
                            int code = i.getId();
                            String name = i.getName();
                            String Lname=i.getSurname();
                            String Country=i.getCountry();
                            String City=i.getCity();
                            int sid=i.getIdSport();
                            String Date=i.getBirthday();


                            result = result + "\n Id: " + code + "\n Name: " + name + "\n Last name : " + Lname + "\n Country : " + Country + "\n City : " + City + "\n Sport ID : "+sid+"\n Birthday : "+Date+"\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 2:
                        List<Sport> sport = MainActivity.myDatabase.mydaotemp().findAllSports();
                        for (Sport i: sport) {
                            int code = i.getId();
                            String name = i.getName();
                            String eidos = i.getKind();
                            String Fullo=i.getGender();
                            result = result + "\n Id: " + code + "\n Onoma Athlimatos: " + name + "\n Eidos: " + eidos + "\n FUllo: "+Fullo+"\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 3:
                        List<Team> team = MainActivity.myDatabase.mydaotemp().findAllTeams();
                        for (Team i: team) {
                            int kodikos = i.getId();
                            String name = i.getName();
                            String stadio = i.getStadium();
                            String tcountry=i.getCity();
                            String country=i.getCountry();
                            int kathlimata=i.getIdSport();
                            int date=i.getEstablishment();
                            result = result + "\nKwdikos : "+kodikos+"\nName : "+name+"\nStadio : "+stadio+"\nEdra : "+tcountry+"\nCountry : "+country+"\nKwdikos Athlimatos : "+kathlimata+"\nEtos idrisis : "+date+ "\n";
                        }
                        querytextresult.setText(result);
                        break;


                }
            }
        });

        return view;






    }
}
