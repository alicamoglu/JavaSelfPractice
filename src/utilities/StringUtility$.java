package utilities;

public class StringUtility$ {




    public static String reverse(String str) {
        String reverse = "";   // to contain all the characters of the given in reverse method;

        for (int i = str.length()-1; i >=0 ; i--) {   // i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i);              // in any iteration concats all characters

        }
        return reverse;
    }
    public static boolean isContain(String[] array1,String element) {
        int a = 0;
        for (String s : array1) {
            if(s.equals(element)){
                a++;
            }
        }
        if (a != 0){
            return true;
        }else {
            return false;
        }
    }
    public static int firstIndexArrayElement(String[] array1,String element) {
        int index = -1;            // when element not contained it gives -1 that's why is negative
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] == element){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int lastIndexArrayElement(String[] array1,String element) {
        int index = -1;             // when element not contained it gives -1 that's why is negative
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] == element){
                index = i;                // if break after first meeting with
                            }
        }
        return index;
    }
}
