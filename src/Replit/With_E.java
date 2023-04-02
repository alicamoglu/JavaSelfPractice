package Replit;
import java.util.Arrays;
import java.util.Scanner;
public class With_E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));
    }
    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE
        int index = 0;
        for (String each: arr){
            if(each.contains("e")){
                index++;
            }
        }
        int i = 0;
        String [] arr1 =new String[index];
        for (String s : arr) {
            if (s.contains("e")){
                arr1[i++] = s;
            }
        }
//      return arr1;

        //YOUR CODE ENDS HERE

        return arr1;
    }

}
