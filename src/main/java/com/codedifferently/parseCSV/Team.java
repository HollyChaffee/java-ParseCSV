package com.codedifferently.parseCSV;

public class Team {

    private String team;
    private Integer games;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    private Integer goals;
    private Integer goalsAllowed;
    private Integer points;

    public Team() {

    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(Integer goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return
                "Team Name: " + team + '\n' +
                "Games: " + games + '\n' +
                "Wins: " + wins + '\n' +
                "Losses: " + losses + '\n' +
                "Draws: " + draws + '\n' +
                "Goals: " + goals + '\n' +
                "Goals Allowed: " + goalsAllowed + '\n' +
                "Points: " + points;

    }
}
