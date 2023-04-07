package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;         // does a class with that name also ? (Interesting)
import java.util.Collections;

/*4. write a program that can return the nth largest number from an arraylist
        ex:
        arraylist = {1,2,3,4,5,6,7,7,8,8}
        n = 5
        output:
        4*/
public class Task4$findOutLarget {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        int anchor = 5;
        arrayList.removeIf(p ->p >= 5);
        int a = Collections.max(arrayList);
        System.out.println(a);


    }
}
