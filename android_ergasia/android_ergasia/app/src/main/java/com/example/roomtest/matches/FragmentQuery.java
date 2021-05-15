package com.example.roomtest.matches;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.roomtest.MainActivity;
import com.example.roomtest.R;
import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.sport.Sport;
import com.example.roomtest.team.Team;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class FragmentQuery extends Fragment {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    TextView querytextView, querytextresult;
    Button bnqueryrun;
    int test;

    public FragmentQuery() {

        // Required empty public constructor
    }

    public static FirebaseFirestore db;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        db = FirebaseFirestore.getInstance();
        View view = inflater.inflate(R.layout.fragment_query, container, false);
        final String[] queryArray = getResources().getStringArray(R.array.queries_description_array);
        querytextView = view.findViewById(R.id.txtquery);
        spinner = view.findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(getContext(), R.array.query_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                querytextView.setText(queryArray[position]);
                test = position + 1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        querytextresult = view.findViewById(R.id.txtqueryresult);
        bnqueryrun = view.findViewById(R.id.queryrun);

        bnqueryrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                querytextresult.setText("test" + test);
                String result = "";
                switch (test) {
                    case 1:
                        List<Athlete> athletes = MainActivity.myDatabase.mydaotemp().findAllAthletes();
                        for (Athlete i : athletes) {
                            int code = i.getId();
                            String name = i.getName();
                            String Lname = i.getSurname();
                            String Country = i.getCountry();
                            String City = i.getCity();
                            int sid = i.getIdSport();
                            String Date = i.getBirthday();


                            result = result + "\n Id: " + code + "\n Name: " + name + "\n Last name" + Lname + "\n Country" + Country + "\nCity" + City + "\nSport ID" + sid + "\nBirthday" + Date + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 2:
                        List<Sport> sport = MainActivity.myDatabase.mydaotemp().findAllSports();
                        for (Sport i : sport) {
                            int code = i.getId();
                            String name = i.getName();
                            String eidos = i.getKind();
                            String Fullo = i.getGender();
                            result = result + "\n Id: " + code + "\n Onoma Athlimatos: " + name + "\n Eidos: " + eidos + "\n FUllo: " + Fullo + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 3:
                        List<Team> team = MainActivity.myDatabase.mydaotemp().findAllTeams();
                        for (Team i : team) {
                            int kodikos = i.getId();
                            String name = i.getName();
                            String stadio = i.getStadium();
                            String tcountry = i.getCity();
                            String country = i.getCountry();
                            int kathlimata = i.getIdSport();
                            int date = i.getEstablishment();
                            result = result + "\nKwdikos : " + kodikos + "\nName : " + name + "\nStadio : " + stadio + "\nEdra : " + tcountry + "\nCountry : " + country + "\nKwdikos Athlimatos : " + kathlimata + "\nEtos idrisis : " + date + "\n";
                        }
                        querytextresult.setText(result);
                        break;
                    case 4:
//                        db.collection("match").document("paokaek")
//
//                                .addSnapshotListener((EventListener<DocumentSnapshot>) (value, e) -> {
//
//                                    TeamMatch teamMatch = value.toObject(TeamMatch.class);
//
//                                    querytextresult.setText(convertData(teamMatch));
//
//                                });

                        db.collection("match")
                                .get()
                                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                    @Override
                                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                        if (task.isSuccessful()) {
                                            List<DocumentSnapshot> myListOfDocuments = task.getResult().getDocuments();
                                            StringBuilder result = new StringBuilder();
                                            for (DocumentSnapshot documentSnapshot : myListOfDocuments) {
                                                TeamMatch teamMatch = documentSnapshot.toObject(TeamMatch.class);
                                                result.append("\n").append(convertTeamMatchData(teamMatch));
                                            }
                                            querytextresult.setText(result);
                                        }
                                    }
                                });
                        db.collection("match").limit(1000)

                                .addSnapshotListener((EventListener<QuerySnapshot>) (value, e) -> {


                                });
                        break;
                    case 5:
                        db.collection("tennis")
                                .get()
                                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                    @Override
                                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                        if (task.isSuccessful()) {
                                            List<DocumentSnapshot> myListOfDocuments = task.getResult().getDocuments();
                                            StringBuilder result = new StringBuilder();
                                            for (DocumentSnapshot documentSnapshot : myListOfDocuments) {
                                                Tennis tennis = documentSnapshot.toObject(Tennis.class);
                                                result.append("\n").append(convertTennisMatchData(tennis));
                                            }
                                            querytextresult.setText(result);
                                        }
                                    }
                                });
                        db.collection("tennis").limit(1000)

                                .addSnapshotListener((EventListener<QuerySnapshot>) (value, e) -> {


                                });
                        break;
                    case 6:
                        db.collection("javelin")
                                .get()
                                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                    @Override
                                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                        if (task.isSuccessful()) {
                                            List<DocumentSnapshot> myListOfDocuments = task.getResult().getDocuments();
                                            StringBuilder result = new StringBuilder();
                                            for (DocumentSnapshot documentSnapshot : myListOfDocuments) {
                                                Javelin javelin = documentSnapshot.toObject(Javelin.class);
                                                result.append("\n").append(convertJavelinMatchData(javelin));
                                            }
                                            querytextresult.setText(result);
                                        }
                                    }
                                });
                        db.collection("tennis").limit(1000)

                                .addSnapshotListener((EventListener<QuerySnapshot>) (value, e) -> {


                                });
                        break;


                }
            }

            private String convertTeamMatchData(TeamMatch teamMatch) {
                return teamMatch.getTeamname1().getName() + " - " + " " + teamMatch.getTeamname2().getName() + "  " + teamMatch.getScore1() + "  " + "  " + teamMatch.getScore2();
            }

            private String convertTennisMatchData(Tennis tennis){
                return tennis.getAthleteName1().getName() + " - " + " " + tennis.getAthleteName2().getName() + "  " + tennis.getScore1() + "  " + "  " + tennis.getScore2();

            }
            private String convertJavelinMatchData(Javelin javelin){
                return javelin.getAthleteName1().getName() + " - " + " " + javelin.getAthleteName2().getName() + "  " + javelin.getMetre1() + "  " + "  " + javelin.getMetre2();

            }
        });

        return view;


    }
}
