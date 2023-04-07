package day23_ArrayListContinue;
import java.util.Arrays;
import java.util.ArrayList;

/*3. Write a program that can duplicate the elements of an arraylist
        ex:
        list = [1,2,3,4,5];
        output:
        [1,2,3,4,5,1,2,3,4,5];*/
public class Task3$MakeDuplicate {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5};         // this array to generate arraylist
        int [] listTest = {33};
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(list));        //todo this gives arror although an String array to string arraylist it works
//        ArrayList<Integer> arrayListTest = new ArrayList<>(Arrays.asList(listTest));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(list2);

//        list2.addAll(Arrays.asList(list2));
        list2.addAll(list2);
        System.out.println(list2);













//        int[] intArray = {1, 2, 3, 4, 5};
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//
//        for (int i = 0; i < intArray.length; i++) {
//            arrayList.add(intArray[i]);
//        }
//        System.out.println(arrayList);
    }
}
