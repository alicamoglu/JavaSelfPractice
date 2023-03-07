package Replit;

import java.util.Scanner;
public class ReplitTry {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
//        Scanner s = new Scanner(System.in);
//        String word = s.next();
//        boolean startWithA = word.charAt(0)== 'a',
//                endsWithE = word.charAt(word.length()-1)=='e';
//        System.out.println("Starts with a: " + startWithA);
//        System.out.println("Ends with e: " + endsWithE);

/*        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("first letter: " + word.charAt(0));
        System.out.println("last letter: " + word.charAt(word.length()-1));*/

/*        Scanner s = new Scanner(System.in);
        String word = s.next();

        int indexA = word.indexOf('a');
        System.out.println("index of a: "+indexA);*/

//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        String withoutFirst = word.replace(String.valueOf(word.charAt(0)),""),
//                withoutLast = word.replace(word.substring(word.length()-1),"");
//
////        String withoutFirst = word.replace(String.valueOf(word.charAt(0)),"");
//        System.out.println("without first letter: " + withoutFirst);
//        System.out.println("without las letter: " + withoutLast);

/*
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String wordHalf = word.substring(0,word.length()/2);
        System.out.println(wordHalf+wordHalf);
*/

/*        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.substring(0,1).equalsIgnoreCase("x")){
//            word = word.replace(String.valueOf(word.charAt(0)),"");
            word = word.substring(1);
        }
        if (word.substring(word.length()-1).equalsIgnoreCase("x")){
//            word = word.replace(String.valueOf(word.charAt(word.length()-1)),"");
            word = word.substring(0,word.length()-1);
        }
        System.out.println(word);*/

/*        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//        System.out.println(word.substring(0,4));
//        switch ("java"){
//            case (word.substring(0,4)) :
//                exists = true;
//                break;
//            case (word.substring(1,5)):
//                exists = true;
//                break;
//        }


//        System.out.println(exists);
//        System.out.println(word.substring(0,4).equals("java")?true:word.substring(1,5).equals("java")?true:false);

        if (word.length()==5){
            if (word.substring(0,4).equals("java")||word.substring(1,5).equals("java")) {
                exists = true;
            }
        }else if(word.length()==4) {
            if (word.substring(0, 4).equals("java")) {
                exists = true;
            }
        }
            System.out.println(exists);*/

/*
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println(word1.length()<word2.length()?word2:word1.length()>word2.length()?word1:"");
*/

        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:
        float chickenPrice = 9.75f,
                burgerPrice = 12.50f;
        switch(order) {
            case "chicken":
                System.out.println("Your total is $" + chickenPrice);
                break;
            case "burger":
                System.out.printf("Your total is $" + "%1.2f",burgerPrice);   // Todo printlnf gives error "ln" in the print "\n" adding possible.
        }
    }
}
