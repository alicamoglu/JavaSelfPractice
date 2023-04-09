package day25_DateTime_ConstructorsIntro;
import day25_DateTime_ConstructorsIntro.Task5_Offer;

import java.util.ArrayList;
import java.util.Arrays;

/*    2. Create a class named MyOffers:

        2.1 Create 7 objects of Offer
        2.2 Create an array of Offers named myOffers and store all 7 objects of offers
        2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        2.3.1 Write a program that can remove the offer objects that are not full-time
        2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        2.4.1 Write a program that can remove all the offers that are not from local
        2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
        2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
        2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle

        2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
        2.7.1 Write a program that can remove all the offers that are offering less than 100K salary*/
public class Task5part2_MyOffers {
    public static void main(String[] args) {
//        2.1 Create 7 objects of Offer
        Task5_Offer[] myOffers = new Task5_Offer[7];
//      Task5_Offer[] myOffers = {new Task5_Offer("a","aa","aaa",100_000,true,false,true,false),new Task5_Offer(....)......};      in this way will it be to l

//        2.2 Create an array of Offers named myOffers and store all 7 objects of offers
        myOffers[0] = new Task5_Offer("a","aa","aaa",100_000,true,false,true,false);
        myOffers[1] = new Task5_Offer("b","bb","bbb",110_000,false,true,false,true);
        myOffers[2] = new Task5_Offer("c","cc","Developer",90_000,true,false,true,false);
        myOffers[3] = new Task5_Offer("d","dd","Scrum master",88_000,true,true,true,false);
        myOffers[4] = new Task5_Offer("e","ee","PO",75_000,true,false,false,true);
        myOffers[5] = new Task5_Offer("f","ff","tester",110_000,false,false,true,true);
        myOffers[6] = new Task5_Offer("g","gg","ggg",70_000,false,true,true,false);
//        2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        ArrayList<Task5_Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        System.out.println(fullTimeOffers);
//        2.3.1 Write a program that can remove the offer objects that are not full-time
        fullTimeOffers.removeIf(p->!p.isFullTime);
        System.out.println(fullTimeOffers);
        System.out.println("-------------------------1--------------------");
//        2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        ArrayList<Task5_Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
//          2.4.1 Write a program that can remove all the offers that are not from local

//        2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        ArrayList<Task5_Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
//          2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
        offersWithBenefits.removeIf(p->!(p.hasBenefit && p.hasPTO));
        System.out.println(offersWithBenefits);
        System.out.println("-----------------2----------------------------------");
//        2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.
        ArrayList<Task5_Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
//          2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle
        devOffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("developer"));
        System.out.println(devOffers);
        System.out.println("------------------3---------------------------------");
//        2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.
        ArrayList<Task5_Offer> With100K = new ArrayList<>(Arrays.asList(myOffers));
//          2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
        With100K.removeIf(p->p.salary<100_000);
        System.out.println(With100K);
    }
}
