package day24_ArrayList_Day_Time;

import java.util.ArrayList;
import java.util.Collections;

/*1. Write a program that can display the unique elements of an arrayList:
        ex:
        list = []
        output:
        [2, 4]
        Note: DO NOT use any loops*/
public class Task1$uniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5};      // this is for costructing an array list
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList2.add(array[i]);
        }
        System.out.println(arrayList2);
        System.out.println("------------so far array list is created-----------------");

        ArrayList<Integer> uniques = new ArrayList<>();

        String printStr = "[";                  // without new arraylist for uniques to print in form [2,4] and this brings [
        for (int i = 0; i < arrayList2.size(); i++) {
            if(arrayList2.indexOf(arrayList2.get(i))==arrayList2.lastIndexOf(arrayList2.get(i))){
                uniques.add(arrayList2.get(i));
                printStr += arrayList2.get(i) + ", ";
            }
        }        // this loop gives element to both str and arraylist created to contain uniques
        printStr = printStr.substring(0,printStr.length()-2);           // remove last comma ","
        printStr += "]";                                                // adding last square bracket
        System.out.println(printStr);            // so that is solved in 2 ways
        System.out.println(uniques);
    }
}
