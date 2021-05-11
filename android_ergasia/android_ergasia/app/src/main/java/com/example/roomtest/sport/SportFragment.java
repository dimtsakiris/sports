package com.example.roomtest.sport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.roomtest.R;

public class SportFragment extends Fragment implements View.OnClickListener {

    Button Bn_insert, Bn_update, Bn_delete;
    private SportViewModel mViewModel;

    public static SportFragment newInstance() {
        return new SportFragment();
    }

    public SportFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.sport_fragment, container, false);
        View view = inflater.inflate(R.layout.sport_fragment, container, false);
        Bn_insert = view.findViewById(R.id.insert_sport);
        Bn_insert.setOnClickListener(this);
        Bn_delete = view.findViewById(R.id.delete_sport);
        Bn_delete.setOnClickListener(this);
        Bn_update = view.findViewById(R.id.updatesport);
        Bn_update.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.insert_sport:
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.nav_insert_sport);
                break;
        }
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SportViewModel.class);
        // TODO: Use the ViewModel
    }

}