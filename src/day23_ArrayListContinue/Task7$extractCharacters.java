package day23_ArrayListContinue;

import java.util.ArrayList;

/*7. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
        Ex:

        output:
        list1: {1, 2, 3, 4, 5, 6}
        list2: {A, B, C, D, E, F, G}
        list3: {$, %, #, @, &, !}*/
public class Task7$extractCharacters {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] chars = str.toCharArray();
        ArrayList<Character> arrayListLetters = new ArrayList();
        ArrayList<Character> arrayListDigits = new ArrayList();
        ArrayList<Character> arrayListSpecials = new ArrayList();
        for (char aChar : chars) {
            if(Character.isDigit(aChar)){
                arrayListDigits.add(aChar);
            } else if (Character.isLetter(aChar)) {
                arrayListLetters.add(aChar);
            }else {
                arrayListSpecials.add(aChar);
            }
        }
        System.out.println(arrayListDigits);
        System.out.println(arrayListLetters);
        System.out.println(arrayListSpecials);
    }
}
