package day19_array;

import java.util.Arrays;

/*7. write a program that can move all the zeros to the end of the array
        Ex:
        array = {10, 0, 5, 0, 1, 0};

        output:
        {10, 5, 1, 0, 0, 0}*/
public class ArrayTask7 {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] arrayZeroToEnd = new int[6];          // also works
//        int[] arrayZeroToEnd = {0,0,0,0,0,0};          // also works
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                arrayZeroToEnd[k++] = array[i];
//                k++;
            }
        }
        System.out.println(Arrays.toString(arrayZeroToEnd));
    }
}
