package day19_array;

import utilities.ArraysUtility;

import java.util.Arrays;

/*8. Write a program that can print out the common elements from two integer array
        Ex:


        output:
        4 5
        I made an array of common elements even though the task only requires printing
        */
public class ArrayTask8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        int[] arr3 = new int[ArraysUtility.NumberOfCommonElement(arr1,arr2)];
//        System.out.println(NumberOfCommonElement(arr1,arr2));
        int k =0;
        for (int i = 0; i < arr1.length; i++) {
            int checkNum = 0;
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if(arr1[i] == arr2[i1]){
                    checkNum++;
                }
            }
            if (checkNum>0){
                arr3[k++] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr3));


    }

    public static int  NumberOfCommonElement(int[] arrA,int[] arrB) {
        int lengthFor = 0;

        for (int ii : arrA) {
            int countCommon = 0;
            for (int jj : arrB) {
                if(ii==jj){
                    countCommon++;
                }
            }
            if (countCommon>0){
                lengthFor++;
            }

        }
        return lengthFor;
    }
}
