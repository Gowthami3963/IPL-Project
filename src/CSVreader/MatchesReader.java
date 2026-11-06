package CSVreader;

import model.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MatchesReader {

    public ArrayList<Match> readFile(String filePath) {

        ArrayList<Match> matches = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] values = line.split("\t", -1);

                if (values.length < 7) {
                    System.out.println("Invalid row: " + line);
                    continue;
                }

                  Match match = new Match(
                          values[0],
                          values[1],
                          values[2],
                          values[3],
                          values[4],
                          values[5],
                          values[10]

                  );

                  matches.add(match);

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading File: " + e.getMessage());
        }

        return matches;
    }
}
