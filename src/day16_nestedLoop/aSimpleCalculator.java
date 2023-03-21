package day16_nestedLoop;

import java.util.Scanner;

public class aSimpleCalculator {
    public static void main(String[] args) {
        while (true){
            char operator ;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter please first number:");
            double numb1 = input.nextDouble();
            System.out.println("Enter please second number:");
            double numb2 = input.nextDouble();
            do {
                System.out.println("Enter please math operator:");
                operator = input.next().charAt(0);
            }while (!(operator=='+' || operator =='-' || operator == '*'|| operator == '/'));
            System.out.println(operator == '+'? numb1 + numb2:operator == '-'? numb1 - numb2:operator == '*'? numb1 * numb2:numb1/numb2);
            System.out.println("would you like to continue:");
            String answer;
            do {
                answer = input.next().toLowerCase();
            }while (!(answer.equals("yes") || answer.equals("no")));
            if (answer.equals("no")){
                break;
            }

        }



    }
}
