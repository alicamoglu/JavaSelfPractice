package Replit;
import java.util.Scanner;
public class ReverseString {
    public static String reverse(String input){
        //WRITE YOUR CODE BELOW:
        String input2 = "";
        for (int i = input.length()-1; 0<= i ; i--) {
            input2 += input.charAt(i);
        }
        return input2;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
