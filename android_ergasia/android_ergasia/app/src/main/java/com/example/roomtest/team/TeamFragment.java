package com.example.roomtest.team;

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

public class TeamFragment extends Fragment implements View.OnClickListener {
    Button insertT,updateT,deleteT;
    private TeamViewModel mViewModel;

    public static TeamFragment newInstance() {
        return new TeamFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.team_fragment, container, false);
        insertT = view.findViewById(R.id.insert_sport);
        insertT.setOnClickListener(this);
        updateT = view.findViewById(R.id.delete_sport);
        updateT.setOnClickListener(this);
        deleteT = view.findViewById(R.id.updatesport);
        deleteT.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.insert_team:
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.nav_insert_team);
                break;
            case R.id.update_team:
                NavController navController2 = Navigation.findNavController(v);
                navController2.navigate(R.id.nav_update_team);
                break;
            case R.id.delete_team:
                NavController navController3 = Navigation.findNavController(v);
                navController3.navigate(R.id.nav_delete_team);
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TeamViewModel.class);
        // TODO: Use the ViewModel
    }

}