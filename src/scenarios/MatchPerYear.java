package scenarios;

import model.Match;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MatchPerYear {

    public void matchesPlayedPerYear(ArrayList<Match> matches) {

        HashMap<String, Integer> seasonCount = new HashMap<> ();

        for(Match match : matches) {

            String season = match.getSeason();

            seasonCount.put(
                    season,
                    seasonCount.getOrDefault(season, 0) + 1
            );
        }

        System.out.println("Matches Played Per Year:");

        for (Map.Entry<String, Integer> entry : seasonCount.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }

    }
}
