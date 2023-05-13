package Replit;
import java.util.Scanner;

public class CountDuplicate {

    public static int getDup(String[] arr) {
        int totalDup = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (1 < count) {
                totalDup++;// += count;
            }
        }
        return totalDup;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }


//    public static class Item {
//        public static void main(String[] args) {
//
//            // DO NOT TOUCH ANY CODE HERE
//
//            Scanner input = new Scanner(System.in);
//            Item item = new Item(input.nextLine(), input.nextDouble());
//            System.out.println(item);
//
//        }
//    }
}
