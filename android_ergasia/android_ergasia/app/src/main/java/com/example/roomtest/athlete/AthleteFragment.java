package com.example.roomtest.athlete;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.roomtest.R;

public class AthleteFragment extends Fragment implements View.OnClickListener {

Button insertA,updateA,deleteA;
    private AthleteViewModel mViewModel;

    public static AthleteFragment newInstance() {
        return new AthleteFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.athlete_fragment, container, false);
        insertA = view.findViewById(R.id.insert_athlete);
        insertA.setOnClickListener(this);
        updateA=view.findViewById(R.id.update_athlete);
        updateA.setOnClickListener(this);
        deleteA=view.findViewById(R.id.delete_athlete);
        deleteA.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.insert_athlete:
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.nav_insert_athlete);
                break;
            case R.id.update_athlete:
                NavController navController2 = Navigation.findNavController(v);
                navController2.navigate(R.id.nav_update_athlete);
                break;
            case  R.id.delete_athlete:
                NavController navController3 = Navigation.findNavController(v);
                navController3.navigate(R.id.nav_delete_athlete);
                break;
        }

    }








    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AthleteViewModel.class);
        // TODO: Use the ViewModel
    }

}