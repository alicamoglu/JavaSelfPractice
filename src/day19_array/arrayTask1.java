package day19_array;

import java.util.Arrays;

/*1. create an array named classmates, and store 10 of your classmates' full names
        print the initials of each classmates in separate lines*/
public class arrayTask1 {
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
            System.out.println(classmate);
        }
    }
}
