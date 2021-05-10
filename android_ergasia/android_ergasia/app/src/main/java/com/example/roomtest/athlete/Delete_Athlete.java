package com.example.roomtest.athlete;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;


public class Delete_Athlete extends Fragment {


    EditText editText;
    Button button;

    public Delete_Athlete() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.delete_athlete, container, false);
        editText = view.findViewById(R.id.DCode_Athlete);
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
                Athlete athletes = new Athlete();
                athletes.setId(Var_id);
                MainActivity.myDatabase.mydaotemp().delete_atlhths(athletes);
                Toast.makeText(getActivity(),"Athlete deleted ",Toast.LENGTH_LONG).show();
                editText.setText("");
            }
        });
        return view;
    }
}