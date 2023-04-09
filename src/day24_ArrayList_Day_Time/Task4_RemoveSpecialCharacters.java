package day24_ArrayList_Day_Time;

import java.util.ArrayList;

/*4. Write a program that can remove all the special characters from an arraylist of characters
        ex:
        list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}
        output:
        [A', 'B', '1', '2', 'C', 'D', '3', '4']
        Note: DO NOT use any loops*/
public class Task4_RemoveSpecialCharacters {
    public static void main(String[] args) {
        char[] list = {'$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'};
        ArrayList<Character> charArrayList = new ArrayList<>();
        for (char c : list) {                          // this loop not to solve but to structure arraylist with elements given
            charArrayList.add(Character.valueOf(c));
        }
        charArrayList.removeIf(p->!(Character.isLetter(p) ||Character.isDigit(p)));
        System.out.println(charArrayList);

    }
}
