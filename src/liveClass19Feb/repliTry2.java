package liveClass19Feb;

import java.util.Scanner;

public class repliTry2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String version = input.nextLine();


//        if(version==" 1.5 ")System.out.println(" Cupcake");
//        else if(version==" 1.6 ")System.out.println(" Donut");
//        else if(version=="2.1")System.out.println(" Eclair");
//        else if(version==" 2.2 ")System.out.println(" Froyo");
//        else if(version==" 2.3 ")System.out.println(" Gingerbread");
//        else if(version==" 3.1 ")System.out.println(" Honeycomb");
//        else if(version==" 4.0 ")System.out.println(" Ice Cream Sandwich");
//        else if(version==" 4.1 ")System.out.println(" Jelly Bean");
//        else if(version==" 4.4 ")System.out.println(" KitKat");
//        else if(version==" 5.0 ")System.out.println(" Lollipop");
//        else if(version==" 8.0 ")System.out.println(" Oreo");
//        else if(version==" 9.0 ")System.out.println(" Pie");
//        else System.out.print("Not a valid version");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your version");
        double version = sc.nextDouble();

        if (version == 1.5) {
            System.out.println("Cupcake");
        } else if (version == 1.6) {
            System.out.println("Donut");
        } else if (version == 2.1) {
            System.out.println("Eclair");
        } else if (version == 2.2) {
            System.out.println("Froyo");
        } else if (version == 2.3) {
            System.out.println("Gingerbread");
        } else if (version == 3.1) {
            System.out.println("Honeycomb");
        } else if (version == 4.0) {
            System.out.println("Ice Cream Sandwich");
        } else if (version == 4.1) {
            System.out.println("Jelly Bean");
        } else if (version == 4.4) {
            System.out.println("KitKat");
        } else if (version == 5.0) {
            System.out.println("Lollipop");
        } else if (version == 8.0) {
            System.out.println("Oreo");
        } else if (version == 9.0) {
            System.out.println("Pie");
        } else {
            System.out.print("Not a valid version");
        }
    }


}

