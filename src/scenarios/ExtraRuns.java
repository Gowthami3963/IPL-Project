package scenarios;

import model.Delivery;
import model.Match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExtraRuns {

    public void extraRunsIn2016(ArrayList<Match> matches,
                                ArrayList<Delivery> deliveries) {

        HashMap<String, String> matchSeason = new HashMap<>();

        for (Match match : matches) {

            matchSeason.put(
                    match.getId(),
                    match.getSeason()
            );
        }

        HashMap<String, Integer> teamExtraRuns = new HashMap<>();

        for (Delivery delivery : deliveries) {

            String matchId = delivery.getMatchId();

            String season = matchSeason.get(matchId);

            if ("2016".equals(season)) {

                String team = delivery.getBowlingTeam();

                int extraRuns = Integer.parseInt(delivery.getExtraRuns());

                teamExtraRuns.put(
                        team,
                        teamExtraRuns.getOrDefault(team, 0) + extraRuns
                );
            }
        }

        System.out.println("Extra Runs scored By Each Team in 2016:");

        for (Map.Entry<String, Integer> entry : teamExtraRuns.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }









    }


}
