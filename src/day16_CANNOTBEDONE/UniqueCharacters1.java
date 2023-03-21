package day16_CANNOTBEDONE;
import java.util.Scanner;
public class UniqueCharacters1 {
    public static void main(String[] args) {
        System.out.println("enter a string to check unique characters in it: ");
        String str = new Scanner(System.in).nextLine();
        int caunt = 0;
        String equalS = "";    // equals character will be in this string added.
        for (int i = 0; i < str.length(); i++) {
            caunt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j));{
                    caunt++;
                }
            }
            if (caunt == 1){// && !equalS.contains("" + str.charAt(i))){  // this part is not needed but when you search characters 2 times in string exists.
                equalS += "" + str.charAt(i);
            }
//            caunt = 0;
        }
        System.out.println(equalS);



//        other solution approuch : comparing firt index and last index of all characters
//        for (int i = 0; i < str.length(); i++) {
//            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
//                equalS += str.charAt(i);
//            }
//        }
//        System.out.println(equalS);
    }
}
