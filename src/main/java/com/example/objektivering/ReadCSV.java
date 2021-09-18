package com.example.objektivering;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCSV

{




    public ArrayList<ArrayList<String>> readCSV() {

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        ArrayList<String> lines = new ArrayList<>();

        int i = -1;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("./assets/sample.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sc.useDelimiter(","); //sets the delimiter pattern
        while (sc.hasNextLine())  // a boolean value
        {
            i+=1;
           lines.add(i, sc.nextLine());

        }

        for(int n=0; n<lines.size(); n++) {
            ArrayList<String> wordsArray = new ArrayList<>();
            String[] words = lines.get(n).split(",");
            for(String word: words){
                wordsArray.add(word);
            }
            data.add(wordsArray);
        }

        System.out.println(data);


        sc.close();
        return data;

    }




}