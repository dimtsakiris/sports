package com.example.roomtest;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "team_table",primaryKeys = {"id_team","sport_id"},
        foreignKeys = {@ForeignKey(entity = Sport.class,parentColumns = "id",childColumns = "sport_id",onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class Team {
    @ColumnInfo(name="id_team")@NonNull
    private int id_team;

    @ColumnInfo(name="sport_id") @NonNull
    private int id_sport;

    @ColumnInfo(name="name_team")
    private String team_name;

    @ColumnInfo(name="name_stadium")
    private String stadium_name;

    @ColumnInfo(name="city_team")
    private String team_city;

    @ColumnInfo(name = "country_team")
    private String team_country;

    @ColumnInfo(name="year_establishment")
    private String establishment_year;

    public int getId_team() {
        return id_team;
    }

    public void setId_team(int id_team) {
        this.id_team = id_team;
    }

    public int getId_sport() {
        return id_sport;
    }

    public void setId_sport(int id_sport) {
        this.id_sport = id_sport;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getStadium_name() {
        return stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }

    public String getTeam_city() {
        return team_city;
    }

    public void setTeam_city(String team_city) {
        this.team_city = team_city;
    }

    public String getTeam_country() {
        return team_country;
    }

    public void setTeam_country(String team_country) {
        this.team_country = team_country;
    }

    public String getEstablishment_year() {
        return establishment_year;
    }

    public void setEstablishment_year(String establishment_year) {
        this.establishment_year = establishment_year;
    }
}
