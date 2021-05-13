package com.example.roomtest.sport;

import android.os.Bundle;
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

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.HashMap;
import java.util.Map;

public class insert_sport_fragment extends Fragment  {
EditText c_sport,n_sport,k_sport,g_sport;
Button btn;
    public static FirebaseFirestore db;
    public insert_sport_fragment(){


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.insert_sport, container, false);
        c_sport=view.findViewById(R.id.code_sport);
        n_sport=view.findViewById(R.id.sport_name);
        k_sport=view.findViewById(R.id.sport_kind);
        g_sport=view.findViewById(R.id.sport_gender);
        btn=view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int Team_code = 0;
                try {
                    Team_code = Integer.parseInt(c_sport.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }

                String Sport_Name = n_sport.getText().toString();
                String Sport_Kind = k_sport.getText().toString();
                String Gender_Sport = g_sport.getText().toString();


                try {
                    Sport sport=new Sport();
                    sport.setId(Team_code);
                    sport.setName(Sport_Name);
                    sport.setKind(Sport_Kind);
                    sport.setGender(Gender_Sport);
                    MainActivity.myDatabase.mydaotemp().insertSport(sport);

                    Toast.makeText(getActivity(), "Sport added.", Toast.LENGTH_LONG).show();
                    db = FirebaseFirestore.getInstance();

                    // Create a new user with a first and last name


// Add a new document with a generated ID
                    Log.d("hfhf", "DocumentSnapshot added with ID: blblb " );
                    db.collection("sports")
                            .add(sport)
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
                c_sport.setText("");
                n_sport.setText("");
                k_sport.setText("");
                g_sport.setText("");
            }


        });
        return view;

    }


}



