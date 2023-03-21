package day11_string;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        String aWord = new Scanner(System.in).nextLine();
            // in three ways solution
            if (aWord.substring(aWord.length()-2).equals("ly")){
                System.out.println("really???");
            } else {
                System.out.println("never Mind");
            }

            switch (aWord.substring(aWord.length()-2)) {
                case "ly":
                    System.out.println("really???");
                    break;
                default:
                    System.out.println("never Mind");
            }
        System.out.println(aWord.substring(aWord.length()-2).equals("ly")?"really???":"never Mind");

    }
}

/*
3. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
*/
