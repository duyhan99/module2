package com.han.CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVReader {
    private static final String DELIMETER = ",";

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\country.csv"));
            while ((line = br.readLine()) != null){
                printCountry(csvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if(br != null)
                    br.close();
            }catch (IOException crunchifyException){
                crunchifyException.printStackTrace();
            }
        }
    }

    private static ArrayList<String> csvLine(String line){
        ArrayList<String> res = new ArrayList<>();
        if(line != null){
            String[] splitData = line.split(DELIMETER);
            for (int i = 0; i < splitData.length; i++){
                res.add(splitData[i]);
            }
        }
        return res;
    }

    private static void printCountry(ArrayList<String> country) {
        System.out.println(country);
    }


}
