package day16_nestedLoop;
import java.util.Scanner;
public class NestedLoopShowTwiceExists {
    public static void main(String[] args) {
        System.out.println("enter a string to check dopple character : ");
        String str = new Scanner(System.in).nextLine();
        String consistOfCharTwiceInStr = "";
        int repetation =0;
        for (int i = 0; i < str.length() ; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    repetation++;
                }
            }
            if(repetation == 2 && !consistOfCharTwiceInStr.contains(""+str.charAt(i))){
                consistOfCharTwiceInStr+= ""+ str.charAt(i);
            }
            repetation=0;

        }
        System.out.println(consistOfCharTwiceInStr);



    }
}
