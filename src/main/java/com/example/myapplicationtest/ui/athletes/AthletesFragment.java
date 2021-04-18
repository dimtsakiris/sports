package com.example.myapplicationtest.ui.athletes;

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

public class AthletesFragment extends Fragment {

    private AthletesViewModel athletesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        athletesViewModel =
                new ViewModelProvider(this).get(AthletesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_athletes, container, false);
        final TextView textView = root.findViewById(R.id.text_athletes);
        athletesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}