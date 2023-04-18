package Replit.SearchTask;

public class TrySth {
    public static void main(String[] args) {
        String str = "tree treat aussage ausrede outcome outside soup";
        System.out.println(str.contains("aus"));
        int count =0;
        while (str.contains("ou")){
            str = str.replaceFirst("ou","");  // without reassignment to str it counts infinite it will be a infinite loop
            count++;
        }
        System.out.println("count: " + count);
        System.out.println( "str: " + str);
    }
}
// practice with string contain method and count an expression with it in string