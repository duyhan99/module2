package com.han.CSV;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    private static final String DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String FILE_HEADER = "Start Ip,End Ip,Start Code,End Code,Country Code,Country Name";

    public static void main(String[] args) {
        String fileName = "D:\\country.csv";
        writeCsvFile(fileName);
    }

    private static void writeCsvFile(String fileName) {
        Country country1 = new Country("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        Country country2 = new Country("1.0.1.0","1.0.3.255","16777472","16778239","CN","China");
        Country country3 = new Country("1.0.4.0","1.0.7.255","16778240","16779263","AU","Australia");
        Country country4 = new Country("1.0.8.0","1.0.15.255","16779264","16781311","CN","China");
        Country country5 = new Country("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan");
        Country country6 = new Country("1.0.32.0","1.0.63.255","16785408","16793599","CN","China");
        Country country7 = new Country("1.0.64.0","1.0.127.255","16793600","16809983","JP","Japan");
        Country country8 = new Country("1.0.128.0","1.0.255.255","16809984","16842751","TH","Thailand");

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);
        countries.add(country8);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE);

            for (Country country:
                    countries) {
                fileWriter.append(country.getStartIp());
                fileWriter.append(DELIMITER);
                fileWriter.append(country.getEndIp());
                fileWriter.append(DELIMITER);
                fileWriter.append(country.getStartCode());
                fileWriter.append(DELIMITER);
                fileWriter.append(country.getEndCode());
                fileWriter.append(DELIMITER);
                fileWriter.append(country.getCountryCode());
                fileWriter.append(DELIMITER);
                fileWriter.append(country.getCountryName());
                fileWriter.append(NEW_LINE);
            }
            System.out.println("Success.");
        }
        catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
