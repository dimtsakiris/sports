package com.example.roomtest.matches;

import com.example.roomtest.sport.Sport;
import com.example.roomtest.team.Team;

public class TeamMatch {
    private String date;
    private String city;
    private String country;
    private Sport sport;
    private Team team1;
    private Team team2;
    private Integer score1;
    private Integer score2;
    private Team teamname1;
    private Team teamname2;

    public TeamMatch() {
    }

    public TeamMatch(String date, String city, String country, Sport sport, Team team1, Team team2, Integer score1, Integer score2, Team teamname1, Team teamname2) {
        this.date = date;
        this.city = city;
        this.country = country;
        this.sport = sport;
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.teamname1=teamname1;
        this.teamname2=teamname2;

    }

    public Team getTeamname1() {
        return teamname1;
    }

    public Team getTeamname2() {
        return teamname2;
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

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Integer getScore1() {
        return score1;
    }

    public Integer getScore2() {
        return score2;
    }
}
