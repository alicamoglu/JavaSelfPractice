package day20_forEach;

import utilities.ArraysUtility;

/*4. Write a program that can display the unique elements of an array
        MUST use for each loops*/
public class TaskForEach4 {
    public static void main(String[] args) {
        int [] arrays = {22,56,84,66,32,15,22,54,56,32,55};
        for (int array : arrays) {
            if(ArraysUtility.frequencyOfElement(arrays,array)==1){
                System.out.println(array);
            }

        }
        //            System.out.println(frequencyOfElement(arrays,22));
    }

    public static int frequencyOfElement(int[] arrA,int elementA) {
        int count = 0;
        for (int each : arrA) {
            if (each == elementA){
                count++;
            }
        }
        return count;
    }
}
