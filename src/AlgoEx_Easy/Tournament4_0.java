package AlgoEx_Easy;

import java.util.*;

//https://www.mycompiler.io/view/DR3UpBGxRE6
public class Tournament4_0 {
    public static void main(String[] args) {

        ArrayList<String> cpt1 = new ArrayList<>(Arrays.asList("html", "c#"));
        ArrayList<String> cpt2 = new ArrayList<>(Arrays.asList("c#", "python"));
        ArrayList<String> cpt3 = new ArrayList<>(Arrays.asList("python", "html"));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0,0,1));
        ArrayList<ArrayList<String>> competitions = new ArrayList<>(Arrays.asList(cpt1, cpt2, cpt3));

//Learn Jay
        ArrayList<String> competition = new ArrayList<>();
        HashMap<String, Integer> scores = new HashMap<>();

        String currentTeam = "";
        String winningTeam = "";

        scores.put(currentTeam, 0);

        for(int i = 0; i < competitions.size(); i++) {
            competition = competitions.get(i);
            int result = results.get(i);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            winningTeam = (result == 1) ? homeTeam : awayTeam;

            updateScores(winningTeam, 1, scores);

            if(scores.get(winningTeam) > scores.get(currentTeam)) {
                currentTeam = winningTeam;
            }
        }

        System.out.println("Winning Team:: "+currentTeam);
        System.out.println("Scores:: "+scores);
    }

    //figure out who is hte windder in each game ( array ),
    //insert it winner in the hashaap ,    if the HM have the string in it, so increase the count of it. Like this  "python": 2.

//Learn Jay
    public static void updateScores(String team, int points, HashMap<String, Integer> scores) {
        if(!scores.containsKey(team)) {
            scores.put(team, 0);
        }
        scores.put(team, scores.get(team) + points);
    }

}
