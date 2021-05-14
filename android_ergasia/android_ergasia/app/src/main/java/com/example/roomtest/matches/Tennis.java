package com.example.roomtest.matches;

import com.example.roomtest.athlete.Athlete;
import com.example.roomtest.sport.Sport;
import com.example.roomtest.team.Team;

public class Tennis {
    private String date;
    private String city;
    private String country;
    private Sport sport;
    private Athlete athleteId1;
    private Athlete athleteId2;
    private Integer score1;
    private Integer score2;
    private Athlete athleteName1;
    private Athlete athleteName2;

    public Tennis(String date, String city, String country, Sport sport, Athlete athleteId1, Athlete athleteId2, Integer score1, Integer score2, Athlete athleteName1, Athlete athleteName2) {
        this.date = date;
        this.city = city;
        this.country = country;
        this.sport = sport;
        this.athleteId1 = athleteId1;
        this.athleteId2 = athleteId2;
        this.score1 = score1;
        this.score2 = score2;
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

    public Integer getScore1() {
        return score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public Athlete getAthleteName1() {
        return athleteName1;
    }

    public Athlete getAthleteName2() {
        return athleteName2;
    }
}
