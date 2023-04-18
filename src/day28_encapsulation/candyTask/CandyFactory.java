package day28_encapsulation.candyTask;

import java.util.ArrayList;

public class CandyFactory {
    public ArrayList<Candy> arrayList= new ArrayList<>();

//    public CandyFactory(ArrayList<Candy> arrayList) {
//        this.arrayList = arrayList;
//    }

    public String toString() {

        return "CandyFactory{" +
                "arrayList=" + arrayList +
                '}';

    }
}
/*      5.1 Create a class named CandyFactory
        Create an ArrayList of candies
        Add five objects of candies
        use for each loop to print the brand and price of each candy*/
