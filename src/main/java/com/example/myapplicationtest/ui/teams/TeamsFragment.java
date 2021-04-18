package com.example.myapplicationtest.ui.teams;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationtest.R;

public class TeamsFragment extends Fragment {

    private TeamsViewModel teamsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        teamsViewModel =
                new ViewModelProvider(this).get(TeamsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_teams, container, false);
        final TextView textView = root.findViewById(R.id.text_teams);
        teamsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}