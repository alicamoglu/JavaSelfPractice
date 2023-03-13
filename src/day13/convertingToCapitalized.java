package day13;

import java.util.Scanner;

public class convertingToCapitalized {
    public static void main(String[] args) {
        String aWord = new Scanner(System.in).next();
        System.out.println(convertCapitalized(aWord));
     }

    public static String convertCapitalized(String word) {
        word = word.substring(0,1).toUpperCase();
        word = word.substring(1).toLowerCase();
        return word;
    }
}
