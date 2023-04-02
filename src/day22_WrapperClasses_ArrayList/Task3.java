package day22_WrapperClasses_ArrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

//3. write a program that can combine two String arrays into one arrayList
//        ex:
//        arr1 = {"A", "B", "C"};
//        arr2 = {"D", "E", "F", "G"};
//        list ==> {"A", "B", "C", "D", "E", "F", "G"}
public class Task3 {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        String[] arr3 = ArraysUtility.merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }

}
