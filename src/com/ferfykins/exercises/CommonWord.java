/*Program to return the most common word in a text file using hashmap.
* Mapping everyword to key, and value to how many times the word occurs.
* Then iterate thru the hashmap to find the highest value */



// remember to adjust code to print words from least to greatest values


package com.ferfykins.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommonWord {

    public static void main(String[] args) {

        String path = "/home/ferfykins273/Desktop/MyJavaCode/Exercises/SearchText/src/com/ferfykins/exercises/search.txt";

        readFile(path);


    }


    public static void readFile(String path) {
        Map<String, Integer> wordMap = new HashMap<>();
        String line;


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");

                for (String words : data) {
                    if (wordMap.containsKey(words)) {
                        int lastValue = wordMap.get(words);
                        lastValue++;
                        wordMap.replace(words, lastValue);
                    } else {
                        wordMap.put(words, 1);
                    }
                }


            }


            Map.Entry<String, Integer> toBe = null;
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                if (toBe == null) {
                    toBe = entry;
                }
                if (entry.getValue() > toBe.getValue()) {
                    toBe = entry;
                }
                System.out.println(entry.getKey() + ":" + entry.getValue());

            }
            System.out.println("The highest Key is: " + "\"" + toBe.getKey() + "\""  + " with the value: " + toBe.getValue());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

