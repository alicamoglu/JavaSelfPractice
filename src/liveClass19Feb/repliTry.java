package liveClass19Feb;

import java.util.*;

public class repliTry {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        System.out.println("version = " + version);
        switch (version) {
//
//        if (version.equals("1.5")) {
//            System.out.println("Cupcake");
//        } else if (version.equals("1.6")) {
//            System.out.println("Donut");
//        } else if (version.equals("2.1")) {
//            System.out.println("Eclair");
//        } else if (version.equals("2.2")) {
//            System.out.println("Froyo");
//        } else if (version.equals("2.3")) {
//            System.out.println("Gingerbread");
//        } else if (version.equals("3.1")) {
//            System.out.println("Honeycomb");
//        } else if (version.equals("4.0")) {
//            System.out.println("Ice Cream Sandwich");
//        } else if (version.equals("4.1")) {
//            System.out.println("Jelly Bean");
//        } else if (version.equals("4.4")) {
//            System.out.println("KitKat");
//        } else if (version.equals("5.0")) {
//            System.out.println("Lollipop");
//        } else if (version.equals("8.0")) {
//            System.out.println("Oreo");
//        } else if (version.equals("9.0")) {
//            System.out.println("Pie");
//        } else {
//            System.out.println("Not a valid version");
//        }
//        Thread t1 = new Thread();
//        Thread t2 = new Thread();
//        Thread t3 = t1;
//
//        String s1 = new String("GEEKS");
//        String s2 = new String("GEEKS");
//
//        System.out.println(t1 == t3);
//        System.out.println(t1 == t2);
//        System.out.println(s1 == s2);
//
//        System.out.println(t1.equals(t2));
//        System.out.println(s1.equals(s2));
//

            //WRITE YOUR CODE BELOW:
            case "1.5":
                System.out.println("Cupcake");
                break;
            case "1.6":
                System.out.println("Donut");
                break;
            case "2.1":
                System.out.println("Eclair");
                break;
            case "2.2":
                System.out.println("Froyo");
                break;
            case "2.3":
                System.out.println("Gingerbread");
                break;
            case "3.1":
                System.out.println("Honeycomb");
                break;
            case "4.0":
                System.out.println("Ice Cream Sandwich");
                break;
            case "4.1":
                System.out.println("Jelly Bean");
                break;
            case "4.4":
                System.out.println("KitKat");
                break;
            case "5.0":
                System.out.println("Lollipop");
                break;
            case "8.0":
                System.out.println("Oreo");
                break;
            case "9.0":
                System.out.println("Pie");
                break;
            default:
                System.out.println("Not a valid version");
                break;

        }
        // else System.out.print("Not a valid version");


    }

}


