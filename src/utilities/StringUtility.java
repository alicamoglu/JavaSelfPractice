package utilities;

public class StringUtility {




    public static String reverse(String str) {
        String reverse = "";   // to contain all the characters of the given in reverse method;

        for (int i = str.length()-1; i >=0 ; i--) {   // i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i);              // in any iteration concats all characters

        }
        return reverse;
    }
    public static boolean isPalindrome(String str) {
         // --------------------FİRST WAY------------------------------
//        String reverse = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse += str.charAt(i);         // not only loop but also the method end if t
//        }
//        return str.equals(reverse);
        // --------------------SECOND WAY------------------------------
        for(int begin = 0, end = str.length()-1;begin <= str.length()/2;begin++,end--){
            if(str.charAt(begin)!=str.charAt(end)){
                return false;    //todo if this if body works not only for loop but also whole method ends and nothing below works
            }
        }
        return true;
    }
    public static boolean hasBlank(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            (""+ str.charAt(i)).equals(" ");
            flag = true;
        }
        return flag;
    }
/*    public static boolean isContain(String a,String b){
        boolean r = false;
        if (a.length()!=a.replaceAll(b,"").length()){
            r = true;
        }
        return r;
    }*/      // a.contains(b) //when both a & b are string there for this utility is no need

}
