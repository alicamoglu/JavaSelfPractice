package day22_WrapperClasses_ArrayList;

import java.util.ArrayList;

/*4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
        list = [1,2,3,4,5];
        output:
        Maximum number is 5
        Minimum number is 1*/
public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> aArrayList = new ArrayList<>();
        aArrayList.add(3);
        aArrayList.add(4);
        aArrayList.add(11);
        aArrayList.add(3);
        aArrayList.add(14);
        aArrayList.add(3);
        int maximum = aArrayList.get(0);
        int minimum = aArrayList.get(0);
        for (int i = 1; i < aArrayList.size(); i++) {
            if (maximum < aArrayList.get(i)) {
                maximum = aArrayList.get(i);
            }
            if (minimum > aArrayList.get(i)) {
                maximum = aArrayList.get(i);
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
