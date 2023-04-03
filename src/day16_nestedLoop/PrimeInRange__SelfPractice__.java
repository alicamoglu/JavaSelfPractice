package day16_nestedLoop;

import java.util.Scanner;

public class PrimeInRange__SelfPractice__ {
    public static void main(String[] args) {
        System.out.println("enter a number to find out prime numbers betweeen 2 and it: ");
        int givenNum = new Scanner(System.in).nextInt();

//    ------------failed try
/*        for (int i = 0; i <= givenNum ; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 2; k < j; k++) {
                    if (j % k != 0){
                        System.out.print(" ," + i);
                    }
                }
            }
        }*/

//---------------------successfully try
        int i = 3;                //if it starts 2 also successful but starts to print with comma ","
        System.out.print("" + 2); // therefore so start with 2 and continuous with comma and number it gives
        while (i<givenNum) {
            boolean prime = true;      //int a = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    prime = false;//a++;      //when a used and changed from 0 than gives not prime then boolean also works here
                }
            }
            if (prime == true){            //if(a==0)
                System.out.print(" ," + i);
            }
            i++;
        }
    }
}
