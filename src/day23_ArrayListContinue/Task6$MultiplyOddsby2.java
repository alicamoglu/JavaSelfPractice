package day23_ArrayListContinue;

import utilities.CountUtility;

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
        //----------------other 2 ways-------------------
/*        for (Integer integer : arrayList1) {
            if(isOdd(integer)){
                arrayList1.set(arrayList1.indexOf(integer),integer * 2);
            }
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            if(arrayList1.get(i) %2 != 0){
                arrayList1.set(i,  arrayList1.get(i)*2 );
            }
        }*/
        for (Integer integer2 : arrayList1) {
            if(!CountUtility.isEven(integer2)){
                arrayList1.set(arrayList1.indexOf(integer2),integer2 * 2);
            }
        }
        System.out.println(arrayList1);
    }

    public static boolean isOdd(int number1) {
        return number1%2 != 0;
    }

}
