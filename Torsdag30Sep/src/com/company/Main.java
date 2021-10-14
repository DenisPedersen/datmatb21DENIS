package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

      // printWordsStartingWith("Ø");

      //  printWordsOfLength(3);


        printLongestWord();  //kald funktionen som printer det længste ord.
        printFirstHalfOfEachWord(); // kald funktionen som printer første halvdel af hvert ord.
        printMostFrequentLetter(); //kald funktionen som printer det mest brugte bogstav.'
        printLeastFrequentLetter();
    }

    private static void printLeastFrequentLetter() {
        // char [] bogstaver = new char [29];
        ArrayList<Character> bogstaver = new ArrayList<>(); //opret nyt arraylist kaldet bogstaver
        int l;
        for (l = 0; l < text.length; l++) {  //for loop som kører
            String ord = text[l].toLowerCase(); //sørg for at alle bogstaver er små for lettere sammenligning
            int m;
            for (m = 0; m < ord.length(); m++) { //start for loop som kigger igennem alle bogstaver i ord
                bogstaver.add(ord.charAt(m)); //tilføjer bogstavet på charAt's plads til bogstaver-listen
                // bogstaver.add('a');
                // System.out.println(text.frequency(bogstaver, m));
            }
        }
        //lav et Array som indeholder hele alfabetet.
        char[] putBogstaverIArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å'};
        int n;
        for (n = 0; n < putBogstaverIArray.length; n++) {  //lav et for-loop som kører igennem alle pladserne i mit alfabet-Array.
            //System.out.println("Der er så mange " + putBogstaverIArray[n] + " " + Collections.frequency(bogstaver, putBogstaverIArray[n]));
        }
        //lav variabler som skal benyttes i for loop og if-statement.
        char LeastUsedLetter = ' ';
        char current;
        int currentFrequency = 0;
        int LowestFrequencyCount = -1;
        for (int o = 0; o < putBogstaverIArray.length; o++) {  //lav et for-loop som kører igennem igen. Ligesom før!
            current = putBogstaverIArray[o];  // det nuværende bogstav der kigges på er det på o's plads i arrayet[].
            currentFrequency = Collections.frequency(bogstaver, current);  //antallet af gange det bogstav på [o]'s plads forekommer.
            //en if-statement som kigger efter om currentFreq er mindre end det laveste antal forekomster.
            if (currentFrequency < LowestFrequencyCount || LowestFrequencyCount == -1) {
                LeastUsedLetter = current;  //sætter variablen LeastUsedLetter til det nuværende bogstav.
                LowestFrequencyCount = currentFrequency;  //sætter laveste count til nuværende frequency count
            }

            // System.out.println(bogstaver);

        } for (int i = 0; i < putBogstaverIArray.length; i++) {  //lav et for-loop som går igennem bogstav-arryayet.
            int temp = Collections.frequency(bogstaver, putBogstaverIArray[i]); // sæt variablen temp til at være Collections.frequency.
            if (temp == LowestFrequencyCount) {
                System.out.println("Her er det mindst benyttede bogstav : " + putBogstaverIArray[i]); //udskriv det
            }
        }


        //System.out.println("Det mindst brugte bogstav er:" + LeastUsedLetter + " som forekommer " + LowestFrequencyCount + " gange.");
    }

    private static void printMostFrequentLetter() {
        // char [] bogstaver = new char [29];
        ArrayList<Character> bogstaver = new ArrayList<>(); //opret nyt arraylist kaldet bogstaver
        int l;
        for (l = 0; l < text.length; l++) {  //for loop som kører
            String ord = text[l].toLowerCase(); //sørg for at alle bogstaver er små for lettere sammenligning
            int m;
            for (m = 0; m < ord.length(); m++) {
                bogstaver.add(ord.charAt(m));
                // bogstaver.add('a');
                // System.out.println(text.frequency(bogstaver, m));
            }
        }
        char[] putBogstaverIArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å'};
        int n;
        for (n = 0; n < putBogstaverIArray.length; n++) {
            System.out.println("Der er så mange " + putBogstaverIArray[n] + " " + Collections.frequency(bogstaver, putBogstaverIArray[n]));
        }
        char mostUsedLetter = ' ';
        char current;
        int currentFrequency = 0;
        int highestFrequencyCount = 0;
        for (int o = 0; o < putBogstaverIArray.length; o++) {
            current = putBogstaverIArray[o];
            currentFrequency = Collections.frequency(bogstaver, current);
            if (currentFrequency > highestFrequencyCount) {
                mostUsedLetter = current;
                highestFrequencyCount =currentFrequency;
            }

            // System.out.println(bogstaver);

        }System.out.println("Det mest brugte bogstav er:" + mostUsedLetter + " som forekommer " + highestFrequencyCount + " gange.");
    }
    private static void printFirstHalfOfEachWord() {  //Use the .substring() method along with the s.length
        int j;  //lav lokal variabel
        for (j = 0; j < text.length; j++) {  //gå igennem hvert ord i text.length
            System.out.println(text[j].substring(0, text[j].length()/2) );  //print ud at texten på j's plads bliver substringet med text[j] divideret med to.
        }
    }

    private static void printLongestWord() {
        // tjek længde på alle ord i filen
        // sammenlign ordenes længde
        // print det længste. Slut.
        //først laves variablerne. En for længste ord og en for current ord
        String longest_word = "";
        String current = "";
        // lav et for-loop som går igennem text.length
        for (int i = 0; i < text.length; i++) {
            current = text[i];  //det nuværende ord er på plads text[i]
            if (current.length() > longest_word.length()) {  //if statement som kigger efter om current.length er større end longest_word.length.
                longest_word = current;

            }

        }System.out.println("Her er det længste ord i data.text :" + longest_word);
        }


    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:


}
