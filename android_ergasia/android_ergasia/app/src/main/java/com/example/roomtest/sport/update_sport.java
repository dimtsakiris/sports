package com.example.roomtest.sport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;

import androidx.fragment.app.Fragment;

public class update_sport extends Fragment  {
    EditText c_sport,n_sport,k_sport,g_sport;
    Button btn;

    public update_sport(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.update_sport, container, false);
        c_sport=view.findViewById(R.id.Code_Sport);
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
                    MainActivity.myDatabase.mydaotemp().update_athlhma(sport);

                    Toast.makeText(getActivity(), "Sport updated.", Toast.LENGTH_LONG).show();

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




