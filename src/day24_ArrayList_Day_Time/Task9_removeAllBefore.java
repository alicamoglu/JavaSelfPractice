package day24_ArrayList_Day_Time;

import java.time.LocalDate;
import java.util.ArrayList;

/*
9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
*/
public class Task9_removeAllBefore {
    public static void main(String[] args) {
        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2000,3,25));
        dates.add(LocalDate.of(2022,3,25));
        dates.add(LocalDate.of(2016,3,25));
        dates.add(LocalDate.of(2017,3,25));
        dates.add(LocalDate.of(1958,3,25));
        dates.add(LocalDate.of(1987,3,25));

        System.out.println(dates);
        dates.removeIf(p->p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(dates);


    }
}
