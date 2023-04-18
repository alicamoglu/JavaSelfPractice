package Replit;
import java.util.Scanner;
import java.util.ArrayList;
public class SumString {
    public static ArrayList<Integer> getSum(ArrayList<String> digits){
        // finish the method
                     // --------------FİRST way-----------------
//        ArrayList<Integer> returnArrayList=new ArrayList<>();
//        for (String digit : digits) {
//            int newdgit = 0;
////            for (int i = 0; i <String.valueOf(digit).length(); i++) {
//            String str=String.valueOf(digit);
//            for (int i = 0; i <str.length(); i++) {
//                newdgit+=Integer.parseInt(""+str.charAt(i));
//            }
//            returnArrayList.add(newdgit);
//        }
//        return returnArrayList;
                      //--------------OTHER way-----------------
        ArrayList<Integer> returnArrayList=new ArrayList<>();
        for (String digit : digits) {
            int newDigit = 0;
            for (String eachDigit: digit.split("")){
                newDigit += Integer.parseInt(eachDigit);
            }
            returnArrayList.add(newDigit);
        }
        return returnArrayList;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(getSum(list));

    }
}
/*
### Finish the method called `getSum()` that will take an `ArrayList<String>` argument `digits` and returns a `ArrayList<Integer>`. The given characters of the `digits` list will be only positive number digits. Take each digit and calculate the sum. Store the sum into a new ArrayList of Integers. Repeat for each element of the given list. The `getSum()` method is already called in the main method with an argument.
        #### This is a `return` method with an `ArrayList<String>` parameter
        Main topics: methods, Scanner, ArrayList, loops, methods, Wrapper classes
        Example:
        getSum(["123", "34", "513"])
        output:
        [6, 7, 9]
        Example:
        getSum(["4913", "1248"])
        output:
        [17, 15]
        Example:
        getSum(["00110101", "12452", "3111"])
        output:
        [4, 14, 6]
        ```*/

