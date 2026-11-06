package scenarios;

import model.Match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MatchesWon {

    public void matchesWonByTeam(ArrayList<Match> matches){

        HashMap<String, Integer> winnerCount = new HashMap<>();

        for(Match match : matches) {

            String winner = match.getWinner();

            if (winner == null || winner.isEmpty()) {
                continue;
            }

            winnerCount.put(
                    winner,
                    winnerCount.getOrDefault(winner, 0) + 1
            );
        }

        System.out.println("Matches Won By Each Team");

        for(Map.Entry<String, Integer> entry : winnerCount.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}
