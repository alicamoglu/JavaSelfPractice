package day11_string;
import java.util.Scanner;
public class StartWithX$$ {
    public static void main(String[] args) {
        System.out.print("Enter a word");
        String aWord = new Scanner(System.in).nextLine();
        switch (aWord.charAt(0)){
            case 'x':
            //   aWord = (aWord.charAt(0)).replace('x','a');
                aWord = aWord.substring(0,1).replace('x','a') + aWord.substring(1);
        }
        System.out.println(aWord);
    }

}



/*
1. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
        Input:
        xcodex
        Output:
        acodex
*/
