package Replit.SearchTask;

import utilities.StringUtility;
import utilities.StringUtility$;

import java.util.*;

class Main {

    public static String search(ArrayList<String> strs, String find) {
        // complete the method
        String result = "search failed";
        for (String str : strs) {
//            if(isContain(str,find)){
            if(str.contains(find)){
                result = str;
                break;
            }
        }
        return result;
    }
/*    public static boolean isContain(String a,String b){
        boolean r = false;
        if (a.length()!=a.replaceAll(b,"").length()){
        r = true;
        }
        return r;
    }*/            // a.contains(b) //when both a & b are string there for this utility is no need
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}

