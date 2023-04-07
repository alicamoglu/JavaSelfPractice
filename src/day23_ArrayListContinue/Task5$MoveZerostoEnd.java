package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*5. Write a program that can move all the zeros to the last indexes of ArrayList
        ex:
        list: {1,0,2,0,3,0,4,0}
        output:
        [1, 2, 3, 4, 0, 0, 0, 0]*/
public class Task5$MoveZerostoEnd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

//        for (Integer integer : list) {                      // this scope is try in another way
//            if(integer == 0){
////                Collections.swap(list,list.indexOf(integer),list.size()-1);
//                list.add(list.size()-1,integer);
//                list.remove(integer);
//            }
//        }
        int oldSize = list.size();            // here determined is the old size
        list.removeIf(p->p == 0);
        int newSize = list.size();            // here the new size is determined to find out how many element is been removed in removeIf
        int toAdd = oldSize-newSize;
        for (int i = 0; i <toAdd ; i++) {      // here the missing element is being added to the end
            list.add(0);
        }
        System.out.println(list);
    }
}
