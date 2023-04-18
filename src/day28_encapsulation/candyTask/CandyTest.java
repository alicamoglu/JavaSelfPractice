package day28_encapsulation.candyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyTest {
    public static void main(String[] args) {
        Candy candy1 = new Candy("haribo", 200, 0.99, true);
        Candy candy2 = new Candy("toblerone", 15, 10, false);
        Candy candy3 = new Candy("worms", 150, 0.79, true);
        Candy candy4 = new Candy("merci", 30, 4.20, false);
        Candy candy5 = new Candy("maoam", 80, 1.20, true);

        Candy[] group1 = {candy1, candy2, candy3, candy4, candy5};
        ArrayList<Candy> arrayList = new ArrayList<>(Arrays.asList(group1));
        CandyFactory factory1 = new CandyFactory();
        factory1.arrayList = arrayList;
        System.out.println(factory1);

    }
}