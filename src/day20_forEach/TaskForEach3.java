package day20_forEach;

import utilities.StringUtility;

/*3. write a program that can count how many palindromes in an array of string
        Ex:
        {"anna", "level", "Java"};
        output:
        2*/
public class TaskForEach3 {
    public static void main(String[] args) {
        String []arrays={"anna", "level", "Java"};
        int countOfPalindrome = 0;
        for (String array : arrays) {
            if(StringUtility.isPalindrome(array)){
                countOfPalindrome++;
            }
        }
        System.out.println(countOfPalindrome);
    }

}
