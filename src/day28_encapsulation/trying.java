package day28_encapsulation;

import utilities.StringUtility;

public class trying {
    public static void main(String[] args) {
        String str = "";
        String str2 = " 2";
        System.err.println(str.isEmpty());
        System.err.println(str2.isBlank());
        System.out.println(str2.charAt(1));
        System.out.println(StringUtility.hasBlank("ali camoglu"));
        char a = str2.charAt(1);
    }
}
