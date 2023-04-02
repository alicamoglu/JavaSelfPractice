package day22_WrapperClasses_ArrayList;

import java.util.Scanner;

/*2. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
        str = "JAVA java";
        output:
        true*/
public class Task2 {

    public static void main(String[] args) {
        System.out.println("enter a string to check frequancy of Uppers and Lowers ");
        String str = new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        String uppers = "", lowers = "";

        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])){
                uppers += chars[i];
            }else if(Character.isLowerCase(chars[i])){
                lowers += chars[i];
            }
        }
        boolean blln = uppers.length() == lowers.length();
        System.out.println(blln);
    }
}
