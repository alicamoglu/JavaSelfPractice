package Replit;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.*;
public class SortedOrder {

    public static boolean isSorted(ArrayList<Integer> nums) {
        //  finish the method
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }

        }
        return true;
//            ArrayList<Integer> nums1 = new ArrayList<>();
//            for (int i = 0; i < nums.size(); i++) {
//                nums1.add(nums.get(i));
//            }
//            Collections.sort(nums1);
//            if(!nums.equals(nums1)){
//                return false;
//            return true;
    }

            // Do not touch below

    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(isSorted(list));

    }
}

/*  Finish the method called `isSorted()` that will take an `ArrayList<Integer>` argument `nums` and returns a `boolean`. Determine if `nums` is sorted by returning `true` when it is sorted and `false` when it is not sorted. Sorted order is smallest to largest. The `isSorted()` method is already called in the main method with an argument.
        This is a `return` method with an `ArrayList<Integer>` parameter
        Main topics: methods, Scanner, ArrayList, loops, methods
        Example:
        isSorted([1, 5, 5, 8, 6])
        output:
        false
        Example:
        isSorted([0, 0, 3, 5, 8])
        output:
        true
        Example:
        isSorted([1, 2, 5, 4])
        output:
        false
        */
