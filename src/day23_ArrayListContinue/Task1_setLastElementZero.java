package day23_ArrayListContinue;
/*1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output:
        [1,2,3,4,0];*/
import java.util.ArrayList;
import java.util.Arrays;


public class Task1_setLastElementZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        list.set(4,0);                      //         list.set(5,0);   Index 5 out of bounds for length 5
        list.set(list.size()-1, 0);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#","JavaScript"));
        list2.set(3,".....");

        System.out.println(list2);

    }
}
