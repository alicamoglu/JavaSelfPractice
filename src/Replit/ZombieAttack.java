package Replit;
import java.util.Scanner;
public class ZombieAttack {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:

        int i = 0;
        while (inhabitants >0){
            System.out.println("day " + i + " ["+inhabitants+"]");
            inhabitants = inhabitants/2;
            i++;
        }
        for (int day = 0; inhabitants >0  ; day++) {

            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants /= 2 ;

        }

        System.out.println("---- EXTINCT ----");


    }
}
