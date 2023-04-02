package day19_array;

import java.util.Arrays;

/* 2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
                    ex:
        arr = {java, python, c#}

        output:
        avaJ
        nohtyp
        #c   */
public class ArrayTask2 {
    public static void main(String[] args) {
        String [] classmates = new String[10];

        classmates[1]= "Wade";
        classmates[2]= "Dave";
        classmates[3]= "Seth";
        classmates[4]= "Ivan";
        classmates[5]= "Riley";
        classmates[6]= "Gilbert";
        classmates[7]= "Jorge";
        classmates[8]= "Dan";
        classmates[9]= "Brian";
        classmates[0]= "Roberto";
        System.out.println(Arrays.toString(classmates));
        for (String classmate : classmates) {
            String reverseStr = "";
            for (int i = classmate.length() -1; 0 <= i ; i--) {
                reverseStr += classmate.charAt(i);
            }
            System.out.println(reverseStr);
        }
    }

}
