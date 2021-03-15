package com.codedifferently.parseCSV;

import java.util.ArrayList;

public class DataParser {
    public ArrayList<Team> parseTeamsDataIntoObject(String data){
        String[] sourceArr = data.split("\n");
        ArrayList<Team> teams = new ArrayList<>();
        for(int i = 1; i < sourceArr.length; i++){
            Team team = new Team();
            String[] sArr = sourceArr[i].split(",");
            team.setTeam(sArr[0]);
            team.setGames(Integer.parseInt(sArr[1]));
            team.setWins(Integer.parseInt(sArr[2]));
            team.setLosses(Integer.parseInt(sArr[3]));
            team.setDraws(Integer.parseInt(sArr[4]));
            team.setGoals(Integer.parseInt(sArr[5]));
            team.setGoalsAllowed(Integer.parseInt(sArr[6]));
            team.setPoints(Integer.parseInt(sArr[7]));
            teams.add(team);
        }
        return teams;
    }
}