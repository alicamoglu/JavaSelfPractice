package day24_ArrayList_Day_Time;

import java.util.ArrayList;
import java.util.Arrays;

/*2. Write a program that can remove all the digits from an arraylist of characters
        ex:
        list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}
        output:
        ['$', A', 'B', 'C', 'D', '@', '!']
        Note: DO NOT use any loops*/
public class Task2$RemoveDigits {
    public static void main(String[] args) {
        char[] list = {'$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'};
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char c : list) {                          // this loop not to solve but to structure arraylist with elements given
            charArrayList.add(Character.valueOf(c));
        }
        System.out.println(charArrayList);
        charArrayList.removeIf(p ->Character.isDigit(p));
        System.out.println(charArrayList);
    }
}
