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
}
