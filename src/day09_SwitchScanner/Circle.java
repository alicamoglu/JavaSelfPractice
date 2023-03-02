package day09_SwitchScanner;
import java.lang.Math;
import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter radius of circle: ");
        float radius = input.nextFloat();

//        float perimeterOfCircle = 2*Math.PI*radiusf;
//        float areaOfCircle = 2*Math.PI*radiusf;
        double areaOfCircle = Math.PI*Math.pow(radius,2);
        double perimeterOfCircle = 2*Math.PI*radius;
        System.out.println("perimeterOfCircle = " + perimeterOfCircle);
        System.out.println("areaOfCircle = " + areaOfCircle);

        }



    }


/*
2. Create a class named Circle:
        1.1 Ask the user to enter the radius of the circle
        1.1 Calculate the area and perimeter of the circle by using the radius
*/
