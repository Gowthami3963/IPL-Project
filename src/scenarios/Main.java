package scenarios;

import model.Delivery;
import model.Match;
import CSVreader.DeliveriesReader;
import CSVreader.MatchesReader;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        MatchesReader reader = new MatchesReader();

        ArrayList<Match> matches = reader.readFile("data/matches.csv");

       DeliveriesReader read = new DeliveriesReader();

        ArrayList<Delivery> deliveries = read.readFile("data/deliveries.csv");

        System.out.println("Total matches: " + matches.size());

        System.out.println("Total deliveries: " + deliveries.size());

        MatchPerYear m1 = new MatchPerYear();

        MatchesWon m2 = new MatchesWon();

        ExtraRuns m3 = new ExtraRuns();

        TopEconomicalBowlers m4 = new TopEconomicalBowlers();

        ViratCenturiesCount m5= new ViratCenturiesCount();

        Scanner scanner = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("========== IPL ANALYSIS ==========");

            System.out.println();
//
            System.out.println("1. Matches played per year");

            System.out.println("2. Matches won by each team");

            System.out.println("3. Extra runs conceded in 2016");

            System.out.println("4. Top economical bowlers in 2015");

            System.out.println("5. Virat Kohli's Centuries Count");

            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");


            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    m1.matchesPlayedPerYear(matches);
                    break;

                case 2:
                    m2.matchesWonByTeam(matches);
                    break;

                case 3:
                    m3.extraRunsIn2016(matches, deliveries);
                    break;

                case 4:
                    m4.topEconomicalBowlers2015(matches, deliveries);
                    break;

                case 5:
                    m5.viratCenturies(deliveries);
                    break;

                case 0:
                    System.out.println("<<<===================== Exited =====================>>>");
                    return;

                default:
                    System.out.println("Invalid choice");


            }
        }
    }
}
