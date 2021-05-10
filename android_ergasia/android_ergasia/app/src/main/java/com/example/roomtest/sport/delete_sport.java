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

public class delete_sport extends Fragment {
    EditText editText;
    Button button;

    public delete_sport() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.delete_sport, container, false);
        editText = view.findViewById(R.id.sport_delete);
        button = view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Var_id = 0;
                try {
                    Var_id = Integer.parseInt(editText.getText().toString());
                } catch (NumberFormatException ex) {
                    System.out.println("Could not parse " + ex);
                }
                Sport sport = new Sport();
                sport.setId(Var_id);
                MainActivity.myDatabase.mydaotemp().delete_athlhma(sport);
                Toast.makeText(getActivity(),"Sport deleted ",Toast.LENGTH_LONG).show();
                editText.setText("");
            }
        });
        return view;
    }
}
