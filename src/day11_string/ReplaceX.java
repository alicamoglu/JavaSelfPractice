package day11_string;
import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.print("Enter a word");
        String aWord = new Scanner(System.in).nextLine();
        switch (aWord.charAt(0)){
            case 'x':
            aWord = aWord.replace('x','a');
        }
        System.out.println(aWord);
    }

}



/*
2. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
*/
