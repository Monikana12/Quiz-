package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DataReader {

    public static void main(String[] args) {

        String text;
        String D = "";

        try {
            FileReader fileReader = new FileReader("/Users/qamrunnahar/IdeaProjects/Set/src/test/data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((text = bufferedReader.readLine()) != null) {
                D = D + (text + "\n");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> listOftext = new ArrayList<>();

        listOftext.addAll(Arrays.asList(D.split(" ")));

        System.out.println(listOftext.size());
        for (int i = 0; i < listOftext.size(); i++) {
            System.out.println(listOftext.get(i));
        }

    }
}