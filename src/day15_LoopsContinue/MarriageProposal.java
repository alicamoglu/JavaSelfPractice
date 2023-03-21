package day15_LoopsContinue;

import java.util.Scanner;

public class MarriageProposal {
/*    1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
            if the answer is yes, print "Congrats."
            if the answer is no, print "Goodbye"
            if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();


        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid answer.Enter please \"yes\" or \"no\"");
            answer = scan.next().toLowerCase();
            if (answer.equals("yes")){
                System.out.println("Congrats");
            }else if(answer.equals("no")){
                System.out.println("Goodbye");
            }
        }



    }
}
