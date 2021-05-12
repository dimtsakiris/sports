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
Button query;
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

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.nav_query);
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