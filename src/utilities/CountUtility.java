package utilities;

public class CountUtility {



    public static int count(String str,char character) {
        int frequency = 0;
        for (int j = 0; j < str.length(); j++) {
            if (character == str.charAt(j)){
                frequency++;
            }
        }
        return frequency;
    }
    public static boolean isOdd(int number1) {
        return number1%2 != 0;
    }
    public static boolean isEven(int number1) {
        return number1%2 == 0;
    }
}
