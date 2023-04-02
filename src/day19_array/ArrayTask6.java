package day19_array;

import org.w3c.dom.ls.LSOutput;
import utilities.ArraysUtility;

import java.util.Arrays;

/*6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
        array = {1,2,3,4,5};

        output:
        reversedArray = {5,4,3,2,1};*/
public class ArrayTask6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reverseArray = ArraysUtility.reverse(array);

        System.out.println(Arrays.toString(reverseArray));
    }




}
