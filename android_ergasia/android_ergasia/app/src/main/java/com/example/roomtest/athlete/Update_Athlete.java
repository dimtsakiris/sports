package com.example.roomtest.athlete;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;

public class Update_Athlete extends Fragment {
    EditText id_athlete,name_athlete,surname_athlete,country_athlete,city_athlete,bday_athlete,id_sport;
    Button button;

    public Update_Athlete() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.insert_athlete, container, false);
        id_athlete = view.findViewById(R.id.Code_Athlete);
        name_athlete = view.findViewById(R.id.Name_Athlete);
        surname_athlete = view.findViewById(R.id.Sur_Athlete);
        country_athlete = view.findViewById(R.id.Country_Athlete);
        city_athlete = view.findViewById(R.id.City_Athlete);
        bday_athlete = view.findViewById(R.id.Bday);
        id_sport = view.findViewById(R.id.Code_Sport);
        button= view.findViewById(R.id.insert_athlete_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_athleteId= 0;
                try {
                    Var_athleteId = Integer.parseInt(id_athlete.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }


                String Var_athletename=name_athlete.getText().toString();

                String Var_athleteLname=surname_athlete.getText().toString();

                String Var_athleteCountry=country_athlete.getText().toString();
                String Var_athleteCity=city_athlete.getText().toString();


                String Var_athleteBday=bday_athlete.getText().toString();


                int Var_athleteSid= 0;
                try {
                    Var_athleteSid = Integer.parseInt(id_athlete.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }


                try {
                    Athlete athletes= new Athlete(Var_athleteId,Var_athleteSid,Var_athletename,Var_athleteLname,Var_athleteCity,Var_athleteCountry,Var_athleteBday);

                    MainActivity.myDatabase.mydaotemp().update_athlhths(athletes);

                    Toast.makeText(getActivity(), "Record added.", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    String message = e.getMessage();
                    Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
                }
                id_athlete.setText("");
                name_athlete.setText("");
                surname_athlete.setText("");
                country_athlete.setText("");
                city_athlete.setText("");
                id_sport.setText("");
                bday_athlete.setText("");
            }
        });


        return view;
    }



}
