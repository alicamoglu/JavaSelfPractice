package replit;
import java.lang.Math;
import java.util.Scanner;
public class replitTry {
    //public static void main(String[] args) {
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

/*        Scanner s = new Scanner(System.in);
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
                */

/*
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverseResult = word.length()<5?"Too short!": 5<word.length()?"Too long!":new StringBuilder(word).reverse().toString();

        System.out.println(reverseResult);
*/

/*        // Mail priority
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();
        System.out.println(email.contains("project") ? "priority" :email.contains("Alejandro")? "read": "don't read");*/

/*        //midlle character
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        byte remainder = (byte) (word.length() % 2);
//        byte remainder = (byte)word.length() % 2;        //so requared int maybe:casting shoul accur after mod operation. right?
//        int remainder = word.length() % 2;

        switch (remainder){
            case 1:
                System.out.println(word.charAt(word.length()/2));
                break;
            case 0:
                System.out.println(""+word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
        }*/

        /*
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
//        System.out.println(str.substring(n).contains(str.substring(n)));
        System.out.println(str.substring(n).contains(str.substring(0,n))?"true":"false");
*/

/*        // mail parsts
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = email.substring(0,email.indexOf("_")),
                lastName = email.substring(email.indexOf("_")+1,email.indexOf("@")),
                damain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + damain);*/
                   // sandwich
/*
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(str.length());
        System.out.println(str.replaceAll("bread","").length());

        int repeating = (str.length() - str.replaceAll("bread","").length())/5;
        if (repeating == 2){
            String str1 = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            if (str1.length() != 0) {
                System.out.println(str1);
            }else {
                System.out.println("nothing");
            }
        }else {
            System.out.println("nothing");
        }

//       ALL THESE ARE TRY FOR SANDWİCH TASK JUST ABOVE
//        if (repeating == 2 && str.replaceAll("bread","").length() != 0) {
//            str = str.replace(str.substring(str.lastIndexOf("bread")),"");
////            System.out.println(str);
//            System.out.println(str.indexOf("bread")+5);
//            str = str.replaceFirst(str.substring(0,str.indexOf("bread")+5),"");
//            System.out.println(str);
//        }else {
//            System.out.println("nothing");
//        }
//        int breadFirst = str.indexOf("bread");

//        String str1 = str.replace(str.substring(0,str.indexOf("bread")+5),"");
//        System.out.println(str1);
//        String str2 = str1.replace(str1.substring(str1.indexOf("bread")),"");
//        System.out.println(str2);
//        if (str.length()!= str1.length()&&str1.length()!=str2.length()){
//            System.out.println(str2);
//        }else{
//            System.out.println("nothing");
//        }
*/

        //cube
/*    public static void cube(){

        int n = new Scanner(System.in).nextInt();
        System.out.println( n*(int)square(n));
    }

//    public static int square(int n) {
//        return Math.pow(n,2);
    public static double square(int n) {
        return Math.pow(n,2);
    }

    public static void main(String[] args) {
        cube();
    }*/

    //}
//
//    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
//        // WRITE YOUR CODE BELOW:
//        isAvailable = false;
//        if (isAvilable == true){
//
//            if (year != 2018) {
//                return true;
//            }else if ( 8 < month && month <= 12) {
//                return true;
//            } else {
//                if (month == 1 && day < 7){
//                    return true;
//                }else if (month == 8 && day > 7){
//                    return true;
//                }
//
//        }




//    //return false;
//
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
//
//    }

}
