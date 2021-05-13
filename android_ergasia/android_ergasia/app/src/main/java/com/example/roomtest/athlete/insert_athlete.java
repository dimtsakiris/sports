package com.example.roomtest.athlete;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class insert_athlete extends Fragment {
    EditText id_athlete,name_athlete,surname_athlete,country_athlete,city_athlete,bday_athlete,id_sport;
    Button button;
    public static FirebaseFirestore db;

    public insert_athlete() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.insert_athlete, container, false);
        id_athlete = view.findViewById(R.id.Code_Team);
        name_athlete = view.findViewById(R.id.Name_Team);
        surname_athlete = view.findViewById(R.id.Stadium_Name);
        country_athlete = view.findViewById(R.id.Country_Team);
        city_athlete = view.findViewById(R.id.City_Stadium);
        bday_athlete = view.findViewById(R.id.Establishment);
        id_sport = view.findViewById(R.id.Code_Sport);
        button= view.findViewById(R.id.update_team_button);
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
                    Athlete athletes= new Athlete();
                    athletes.setId(Var_athleteId);
                    athletes.setIdSport(Var_athleteSid);
                    athletes.setName(Var_athletename);
                    athletes.setSurname(Var_athleteLname);
                    athletes.setCity(Var_athleteCity);
                    athletes.setCountry(Var_athleteCountry);
                    athletes.setBirthday(Var_athleteBday);

                    MainActivity.myDatabase.mydaotemp().insertAthlete(athletes);

                    Toast.makeText(getActivity(), "Athlete added.", Toast.LENGTH_LONG).show();
                    db = FirebaseFirestore.getInstance();

                    // Create a new user with a first and last name


// Add a new document with a generated ID
                    Log.d("hfhf", "DocumentSnapshot added with ID: blblb " );
                    db.collection("athlete")
                            .add(athletes)
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                @Override
                                public void onSuccess(DocumentReference documentReference) {
                                    Log.d("hfhf", "DocumentSnapshot added with ID: " + documentReference.getId());
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.w("fjj", "Error adding document", e);
                                }
                            });
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
