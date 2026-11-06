package scenarios;

import model.Delivery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ViratCenturiesCount {


    public void viratCenturies(ArrayList<Delivery> deliveries) {

        HashMap<String, Integer> matchRuns = new HashMap<>();

        for (Delivery delivery : deliveries) {

            if (delivery.getBatsman().equals("V Kohli")) {

                String matchId = delivery.getMatchId();

                int runs = Integer.parseInt(delivery.getBatsmanRuns());

                matchRuns.put(
                        matchId,
                        matchRuns.getOrDefault(matchId, 0) + runs
                );
            }
        }


        int centuries = 0;

        System.out.println("Virat Kohli's Centuries:");

        for (Map.Entry<String, Integer> entry : matchRuns.entrySet()) {

            if (entry.getValue() >= 100) {

                centuries++;

                System.out.println(
                        "Match ID: " + entry.getKey()
                                + " | Runs: " + entry.getValue()
                );
            }
        }

        System.out.println("Total Centuries: " + centuries);
    }



}
