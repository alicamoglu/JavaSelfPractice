package day23_ArrayListContinue;
/*2. Write a program that can remove all the names "Ahmed" from an arraylist of String
        ex:
        list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];
        output:
        ["John", "Daniel", "James", "Muhammed"];*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Task2$RemoveSth {
    public static void main(String[] args) {

        String [] nameList = {"John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"};          // this array to generate arraylist
        ArrayList<String> nameList2 = new ArrayList<>(Arrays.asList(nameList));
        System.out.println(nameList2);
        nameList2.remove("John");
        System.out.println(nameList2);
//        nameList2.removeAll("Ahmed");           //todo removeAll works different than remove but how ?
        nameList2.removeAll(Arrays.asList("Ahmed"));
        System.out.println(nameList2);

    }
}
