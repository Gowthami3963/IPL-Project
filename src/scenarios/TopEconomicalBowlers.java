package scenarios;

import model.Match;
import model.Delivery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopEconomicalBowlers {

    public void topEconomicalBowlers2015(ArrayList<Match> matches,
                                         ArrayList<Delivery> deliveries) {

        HashMap<String, Integer> runs = new HashMap<>();
        HashMap<String, Integer> balls = new HashMap<>();

        for (Match match : matches) {
            if (match.getSeason().equals("2015")) {

                 for (Delivery delivery : deliveries) {

                     if (delivery.getMatchId().equals(match.getId())) {

                        String bowler = delivery.getBowler();
                        int conceded = Integer.parseInt(delivery.getTotalRuns())
                                - Integer.parseInt(delivery.getByeRuns())
                                - Integer.parseInt(delivery.getLegByeRuns())
                                - Integer.parseInt(delivery.getPenaltyRuns());

                        runs.put(bowler, runs.getOrDefault(bowler, 0) + conceded);

                        int wide = Integer.parseInt(delivery.getWideRuns());
                        int noBall = Integer.parseInt(delivery.getNoBallRuns());

                        if (wide == 0 && noBall == 0) {
                            balls.put(bowler, balls.getOrDefault(bowler, 0) + 1);}
                     }
                 }
            }
        }
                HashMap<String, Double> economy = new HashMap<>();

           for (String bowler : runs.keySet()) {

            int totalRuns = runs.get(bowler);
            int totalBalls = balls.getOrDefault(bowler, 0);

            if (totalBalls > 0) {
                double rate = totalRuns * 6.0 / totalBalls;
                economy.put(bowler, rate);
            }
        }
        System.out.println("Top 10 Economical Bowlers in 2015:");

        economy.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).limit(10)
                .forEach(e -> System.out.printf("%s : %.2f%n",
                        e.getKey(), e.getValue()));

    }
}
