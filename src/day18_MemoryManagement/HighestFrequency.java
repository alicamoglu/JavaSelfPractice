package day18_MemoryManagement;

/*
1. Write a program that can return the character that has the highest frequency from a string
        Ex:

        output:
        c
        e
*/

import utilities.StringUtility$;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "aaabbccccddeeee";
        
        int fr0 = charFrequency(str,str.charAt(0));
        System.out.println("fr0 = " + fr0);
        while (str.length()>0){


        }
        

    }

    public static int charFrequency(String string1, char ch) {
        int num;
        return num = string1.length()-(string1.replaceAll(""+string1.charAt(0),"").length());
    }
}
class CharofString{
    public char chari;
    public int freq;

    public void setInfo(char chari, int freq) {
        this.chari = chari;
        this.freq = freq;
    }

    public static class Palindrome {
        public static void main(String[] args) {
            while (true){
                Scanner scan = new Scanner(System.in);
                String str1 = scan.nextLine();
                System.out.println(palindrome(str1));
                System.out.println(palindrome2(str1));
                System.out.println(palindrome3(str1));
            }

        }
        public static boolean palindrome(String str) {


                while (str.length() > 1) {
                    if (str.endsWith("" + str.charAt(0))) {
                        str = str.substring(1, str.length() - 1);
                    } else {
                        break;
                    }
                }
                if (str.length() > 1) {
                    return false;
                } else {
                    return true;
                }

            }

        public static boolean palindrome2(String str) {
            if (str.equals(StringUtility$.reverse(str))){
                return true;
            }else {
                return false;
            }
        }

        public static boolean palindrome3(String str){ /// racecar

            for(int begin = 0, end = str.length() - 1; begin < str.length() / 2; begin++, end--){ // or end > str.length() /2
                if(str.charAt(begin) != str.charAt(end)){ // the characters are different
                    return false;
                }
            }

            return true;
        }

    }
}