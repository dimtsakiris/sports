package com.example.roomtest.team;

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

public class delete_team extends Fragment {

    EditText editText;
    Button button;


    public delete_team() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.delete_team, container, false);
        editText = view.findViewById(R.id.DCode_Team);
        button = view.findViewById(R.id.delete_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_id = 0;
                try {
                    Var_id = Integer.parseInt(editText.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                Team team = new Team();
                team.setId(Var_id);
                MainActivity.myDatabase.mydaotemp().delete_omada(team);
                Toast.makeText(getActivity(),"Team deleted ",Toast.LENGTH_LONG).show();
                editText.setText("");
            }
        });
        return view;

    }
}
