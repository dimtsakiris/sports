package com.example.roomtest.matches;

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

public class MatchesFragment extends Fragment implements View.OnClickListener {
Button query,teams,tennis,javelin;
    private MatchesViewModel mViewModel;

    public static MatchesFragment newInstance() {
        return new MatchesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.matches_fragment, container, false);
        query = view.findViewById(R.id.button3);
        query.setOnClickListener(this);
        teams=view.findViewById(R.id.button5);
        teams.setOnClickListener(this);
        tennis=view.findViewById(R.id.buttonTennis);
        tennis.setOnClickListener(this);
        javelin=view.findViewById(R.id.javelin_button);
        javelin.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.nav_query);
                break;
            case R.id.button5:
                NavController navController2 = Navigation.findNavController(v);
                navController2.navigate(R.id.nav_team_matches);
                break;
            case R.id.buttonTennis:
            NavController navController3 = Navigation.findNavController(v);
            navController3.navigate(R.id.nav_tennis);
            break;
            case  R.id.javelin_button:
                NavController navController4 = Navigation.findNavController(v);
                navController4.navigate(R.id.nav_javelin);
                break;

        }
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MatchesViewModel.class);
        // TODO: Use the ViewModel
    }

}