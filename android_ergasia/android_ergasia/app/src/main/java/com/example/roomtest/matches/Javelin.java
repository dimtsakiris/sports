package com.example.roomtest.matches;

import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.sport.Sport;

public class Javelin {
    private String date;
    private String city;
    private String country;
    private Sport sport;
    private Athlete athleteId1;
    private Athlete athleteId2;
    private Integer metre1;
    private Integer metre2;
    private Athlete athleteName1;
    private Athlete athleteName2;

    public Javelin() {
    }

    public Javelin(String date, String city, String country, Sport sport, Athlete athleteId1, Athlete athleteId2, Integer metre1, Integer metre2, Athlete athleteName1, Athlete athleteName2) {
        this.date = date;
        this.city = city;
        this.country = country;
        this.sport = sport;
        this.athleteId1 = athleteId1;
        this.athleteId2 = athleteId2;
        this.metre1 = metre1;
        this.metre2 = metre2;
        this.athleteName1 = athleteName1;
        this.athleteName2 = athleteName2;
    }

    public String getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Sport getSport() {
        return sport;
    }

    public Athlete getAthleteId1() {
        return athleteId1;
    }

    public Athlete getAthleteId2() {
        return athleteId2;
    }

    public Integer getMetre1() {
        return metre1;
    }

    public Integer getMetre2() {
        return metre2;
    }

    public Athlete getAthleteName1() {
        return athleteName1;
    }

    public Athlete getAthleteName2() {
        return athleteName2;
    }
}
