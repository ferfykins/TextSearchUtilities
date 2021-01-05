/*Simple program to search a text file for a given String.... It will return the line numbers that the string occurs on.
* This program will also return how many times the word occured. */




package com.ferfykins.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchString {

    public static void main(String[] args) {


        String path = "/home/ferfykins273/Desktop/MyJavaCode/Exercises/SearchText/src/com/ferfykins/exercises/search.txt";

            readFile("went", path);


    }



    public static void readFile(String searchItem, String path) {
        String line;
        int lineNumber = 1;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while((line = br.readLine()) != null){
                String[] data = line.split(" ");

                for(String words : data) {
                    if (words.equals(searchItem)) {
                        System.out.println(searchItem + " was found on line: " + lineNumber);
                        wordCount++;

                    }
                }
                lineNumber++;



            }

            System.out.println(searchItem + " was found " + wordCount + " times!!");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}








//
//   1. The arrow went to the sun, pondering fruit
//      2.  The moon ran to the stars, sun
//        3.killing eve slowly and fruit
//      4.  pondering solace with ease
//       5. the purple dinosaur went fast
//       6. the fastest way
//       7. the bear enjoyed his honey
//       8. the grim reaked of death
//       9. numbers on the move
//       10. purple is majesty
//       11. my honey is sweet
//       12. random numbers groove
//       13. I enjoyed my coffee
//       14. the cat went meow
//       15. the dog went bark
//       16. the cow went moo
//       17. fastest brush of fate
//       18. the item is soon
//       19. groove on the move
//       20. cindy was grim



















