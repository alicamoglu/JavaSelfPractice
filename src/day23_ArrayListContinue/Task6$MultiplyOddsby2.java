package day23_ArrayListContinue;

import java.util.ArrayList;

/*6. write a program that can multiply each odd number by 2
        ex: list = [1,2,3,4,5];
        output: [2,2,6,4,10]*/
public class Task6$MultiplyOddsby2{
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        int k= 0;
        for (int i : array1) {
            arrayList1.add(i);
        }
        System.out.println(arrayList1);
    }
}
