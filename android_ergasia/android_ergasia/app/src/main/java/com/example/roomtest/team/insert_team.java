
package com.example.roomtest.team;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


public class insert_team extends Fragment {

    EditText KwdOn,name,Stadium,Ccountry,Country,KwdikosAth,Date;
    Button sibn;
    public static FirebaseFirestore db;

    public insert_team() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.insert_team, container, false);
        KwdOn = view.findViewById(R.id.Code_Team);
        name = view.findViewById(R.id.Name_Team);
        Stadium = view.findViewById(R.id.Stadium_Name);
        Ccountry = view.findViewById(R.id.City_Stadium);
        Country = view.findViewById(R.id.Country_Team);
        KwdikosAth = view.findViewById(R.id.Code_Sport);
        Date = view.findViewById(R.id.Establishment);
        sibn = view.findViewById(R.id.update_team_button);
        sibn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_teamId= 0;
                try {
                    Var_teamId = Integer.parseInt(KwdOn.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }


                String Var_teamname=name.getText().toString();

                String Var_teamStadium=Stadium.getText().toString();

                String Var_Tcountry=Ccountry.getText().toString();
                String Var_Country=Country.getText().toString();


                int Var_teamKwdAth= 0;
                try {
                    Var_teamKwdAth = Integer.parseInt(KwdikosAth.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                int Var_teamDate= 0;
                try {
                    Var_teamDate = Integer.parseInt(Date.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }

                try {
                    Team team= new Team();
                    team.setId(Var_teamId);
                    team.setIdSport(Var_teamKwdAth);
                    team.setName(Var_teamname);
                    team.setStadium(Var_teamStadium);
                    team.setCity(Var_Tcountry);
                    team.setCountry(Var_Country);
                    team.setEstablishment(Var_teamDate);

                    MainActivity.myDatabase.mydaotemp().insert_omada(team);

                    Toast.makeText(getActivity(), "Team added.", Toast.LENGTH_LONG).show();
                    db = FirebaseFirestore.getInstance();

                    // Create a new user with a first and last name


// Add a new document with a generated ID
                    Log.d("hfhf", "DocumentSnapshot added with ID: blblb " );
                    db.collection("team")
                            .add(team)
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
                KwdOn.setText("");
                name.setText("");
                Stadium.setText("");
                Ccountry.setText("");
                Country.setText("");
                KwdikosAth.setText("");
                Date.setText("");
            }
        });


        return view;




    }}
