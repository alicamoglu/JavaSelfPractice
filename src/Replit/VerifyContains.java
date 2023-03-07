package Replit;
import java.util.Scanner;
public class VerifyContains {
    //https://replit.com/@javab29/B-Verify-Contains-alicamoglu#README.md
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean containing = sentence.contains(word);
        System.out.println(containing);
    }
}
