package day06;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 5;
        String digitWithLetters = "";    // temporary value is given here and that explicitly shows it will  be reassigned soon

        if (number == 1) {
            digitWithLetters = "one";
        }
        if (number == 2){
            digitWithLetters = "two";
        }
        if (number == 3) {
            digitWithLetters = "three";
        }
        if (number == 4){
            digitWithLetters = "four";
        }
        if (number == 5) {
            digitWithLetters = "five";
        }
        if (number == 6){
            digitWithLetters = "six";
        }

        if (number == 7) {
            digitWithLetters = "seven";
        }
        if (number == 8){
            digitWithLetters = "eight";
        }
        if (number == 9){
            digitWithLetters = "nine";
        }
        System.out.println("digitWithLetters = " + digitWithLetters);



    }
}


/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

        Note: Do not use more than one print statement
*/
