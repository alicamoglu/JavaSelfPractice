package day24_ArrayList_Day_Time;
/*3. Write a program that can remove all the letters from an arrayList of characters
        ex:
        list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}
        output:
        ['$',  '1', '2', '@', '!', '3', '4']*/

import java.util.ArrayList;

public class Task3_RemoveAllLetters {
    public static void main(String[] args) {
        char[] list = {'$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'};
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char c : list) {                          // this loop not to solve but to structure arraylist with elements given
            charArrayList.add(Character.valueOf(c));
        }
        charArrayList.removeIf(p->Character.isLetter(p));
        System.out.println(charArrayList);
    }
}
