package replit;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        int totalSecond = new Scanner(System.in).nextInt();
        int hours = 0,
                minuten = 0,
                second = 0;
        hours = totalSecond / 3600;
        int remaindFromHours = totalSecond % 3600;
        minuten = remaindFromHours / 60 ;
        int remaindFromMinuten = remaindFromHours % 60;

        System.out.println(hours + " hours, "+ minuten + " minuten, and " + remaindFromMinuten + " seconds");

    }
}
