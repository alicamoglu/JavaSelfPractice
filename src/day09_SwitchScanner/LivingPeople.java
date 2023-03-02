package day09_SwitchScanner;

import java.util.Scanner;

public class LivingPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("how many people do you live with: ");
        int person = input.nextInt();

        System.out.println( person<3? "Live with less than 3 people" : 3<= person && person <=6 ? "Live with 3 - 6 people" : "Live with more than 6 people");











    }
}
/*

1. Ask the user how many people they live with:
        if user lives with Less than 3 people: print "Live with less than 3 people"
        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
        if the user lives with more than 6 people: print "Live with "more than 6 people"
*/
