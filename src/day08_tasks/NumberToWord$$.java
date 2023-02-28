package day08_tasks;

public class NumberToWord$$ {
    public static void main(String[] args) {
        int number = 9;

        String numberWord = (number == 0) ? "zero" :
            (number == 1) ? "one" :
            (number == 2) ? "two" :
            (number == 3) ? "three" :
            (number == 4) ? "four" :
            (number == 5) ? "five" :
            (number == 6) ? "six" :
            (number == 7) ? "seven" :
            (number == 8) ? "eight" :
            (number == 9) ? "nine" : "";
        System.out.println(numberWord);

    }


}
/*
1. Create a class called NumberToWord,
        write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

        Note: MUST use ternary
*/

