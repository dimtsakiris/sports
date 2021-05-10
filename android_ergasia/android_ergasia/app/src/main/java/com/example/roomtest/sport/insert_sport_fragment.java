package com.example.roomtest.sport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roomtest.R;

import androidx.fragment.app.Fragment;

public class insert_sport_fragment extends Fragment  {


    public insert_sport_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.insert_sport, container, false);

        return view;

    }


}



