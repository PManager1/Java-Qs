package AlgoEx_Easy;


//help https://www.mycompiler.io/view/DR3UpBGxRE6
//result = [0,0,1];
//0 means home team lost.
// python won most games. so we return the name as "Python"


import java.util.*;

public class TournamentWinnder4 {
    public static void main(String[] args) {

        ArrayList<String> cpt1 = new ArrayList<>(Arrays.asList("html", "c#"));
        ArrayList<String> cpt2 = new ArrayList<>(Arrays.asList("c#", "python"));
        ArrayList<String> cpt3 = new ArrayList<>(Arrays.asList("python", "html"));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0,0,1));
        ArrayList<ArrayList<String>> competitions = new ArrayList<>(Arrays.asList(cpt1, cpt2, cpt3));
        ArrayList<String> competition = new ArrayList<>();
        HashMap<String, Integer> scores = new HashMap<>();
        String currentTeam = "";
        String winningTeam = "";


       String res =  findWinner(competitions,results);
        System.out.println("res = " + res );
    }

    //figure out who is hte windder in each game ( array ),
    //insert it insdiet the hashaap ,    if the HM have the string in it, so increase the count of it. Like this  "python": 2.

    public static String findWinner( ArrayList competitions , ArrayList results ) {
        System.out.println("comps="+ competitions);
        System.out.println("results="+ results);

        var hm = new HashMap<Integer, String>();

        for (int i = 0; i < competitions.size(); i++) {
            int winner = (Integer) results.get(i);
            System.out.println("results  = "+results.get(i));

        }
        return "a";
    }

}
