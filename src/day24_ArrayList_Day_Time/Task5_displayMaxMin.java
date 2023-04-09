package day24_ArrayList_Day_Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*5. Write a program that can display the second maximum and minimum numbers from an arraylist of integers
        ex:
        list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}
        output:
        second maximum number is 7
        second minimum number is 1
        Note: DO NOT use any loops*/
public class Task5_displayMaxMin {
    public static void main(String[] args) {
        int [] arrayY = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8};
        ArrayList<Integer> arrayListT = new ArrayList<>();
        for (int Y : arrayY) {
            arrayListT.add(Y);              // this loop is not to solve but to struct an array list
        }
        System.out.println(arrayListT);
        int maxS = Collections.max(arrayListT);
        int min2;
        arrayListT.removeAll(Arrays.asList(maxS));
        int max2 = Collections.max(arrayListT);
        System.out.println(max2);
        // just above is manual finding 2th max and now below finding automatically 2th min or any line max
        int rankOfMin = 2;            // 2th min finding  if it's been changed to 4 you become 4th min element.
        for (int i = 1; i < rankOfMin; i++) {
            arrayListT.removeAll(Arrays.asList(Collections.min(arrayListT)));
        }
        min2 = Collections.min(arrayListT);
        System.out.println(min2);

    }
}
