package CSVreader;

import model.Delivery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DeliveriesReader {

    public ArrayList<Delivery> readFile(String filePath) {

        ArrayList<Delivery> deliveries = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            reader.readLine();

            while (( line = reader.readLine()) != null) {

                String[] values = line.split(",", -1);
                Delivery delivery = new Delivery(
                        values[0], values[3], values[16],values[8],
                        values[17],
                        values[10],
                        values[13],
                        values[11],
                        values[12],
                        values[14],
                        values[6],
                        values[15]

                );

                deliveries.add(delivery);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return deliveries;
    }
}