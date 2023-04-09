package day24_ArrayList_Day_Time;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/*
8. Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
*/
public class Task8_birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter please year month and day with comma between them");
        String [] dates = scan.nextLine().trim().split(",");          // with this trim() method in this line it tolerates if space at the very beginning of the entry but the trim() methods below in line 21 clear for any space around the year month or day.
        System.out.println(Arrays.toString(dates));
/*        String a = "14";                     remembering for parseInt
        int b = Integer.parseInt(a);
        System.out.println(b);*/
//        int abc = dates.split(",");
//        LocalDate birthday = LocalDate.of(1998,11,27);            //given date hardcode
        LocalDate birthday = LocalDate.of(Integer.parseInt(dates[0].trim()),Integer.parseInt(dates[1].trim()),Integer.parseInt(dates[2].trim()));       //this is with input scanner
        boolean isLeap = birthday.isLeapYear();//getYear()
        System.out.println(isLeap);
    }
}
