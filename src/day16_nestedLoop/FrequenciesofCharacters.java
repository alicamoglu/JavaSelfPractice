package day16_nestedLoop;
/*
7. Write a program that can find the frequency of the characters from a string
        Ex:
        str = "aabcccd";
        output:
        a2b1c3d1
        Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
        */
import java.util.Scanner;
public class FrequenciesofCharacters {
    public static void main(String[] args) {
        System.out.println("enter a string to frequency of its characters:");
        String str = new Scanner(System.in).nextLine();
        String forPrint = ""; // characters searched will be here added
        int frequency = 0;

        while (str.length() != 0){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(0)==str.charAt(i)){
                    frequency++;
                }
            }
            forPrint += ""+ str.charAt(0) + frequency;
            frequency = 0;
            str = str.replaceAll(""+ str.charAt(0), "");

        }
        System.out.println(forPrint);

        String result = "";  //a2b1c3d1
        // a b c d
        //  2 1 3 1
// other approuch for solution

        for (int k = 0; k <= str.length(); k++) {

            char ch = str.charAt(k); //a
            int count = 0;
            for (int t = 0; t < str.length(); t++) {
                if(str.charAt(t) == ch){
                    count++;
                }
            }

            if(result.contains(""+ch)){ // if the character is already included in the result
                continue; // skip that character
            }

            result +=  ch + "" + count;

        }


        System.out.println(result);



    }

}
