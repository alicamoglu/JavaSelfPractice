package day16_nestedLoop;

import java.util.Scanner;

/*
3. Write a program that can calculate the area and perimeter of a circle:
        1. Ask the user "Enter the radius of the circle:"
        if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"
        2. Display:
        1. Diameter of circle
        2. Area of circle
        3. Perimeter of circle
        3. Ask the user "Would you like to calculate another circle?"
        If "yes" --> repeat the previous steps
        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
        If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
        Hint: you can use  System.exit(1) to terminate the entire program
*/
public class areaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter the radius of the circle:");
            double radius = scan.nextDouble();
            if (radius == 0 || radius < 0){
                System.err.println("Invalid Entry for the radius of the circle");
                break;                  //System.exit(0);
            }else{
                System.out.println("Diameter of circle= " + 2*radius);
                System.out.println("Area of circle= " + Math.PI*Math.pow(radius,2) );
                System.out.println("Perimeter of circle= " + 2*Math.PI*radius);
                System.err.println("Would you like to calculate another circle?");
                String answer = scan.next().toLowerCase();
                while (!(answer.equals("yes") || answer.equals("no"))) {
                    System.err.println("Invalid Entry! antwert please yes or no");
                    answer = scan.next().toLowerCase();
                }
                if (answer.equals("no")){
                    System.err.println("Thank you for using Cydeo Circle Calculator APP");
                    break;
                }


            }
        }


    scan.close();



    }
}
