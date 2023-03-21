package day15_UNSOLVED;

import java.util.Scanner;

/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
        if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
        (if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
        King Bed ==> 120$       Queen Bed ==> 100$        single Bed ==> 80$
        the program should be able to display the room he/she reserved and total price of the room.
        (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
*/
public class RoomReservation {
    public static void main(String[] args) {
        String firstAnswer ="";
        String roomAnswer ="";
        String lastAnswer ="";
        Scanner scan = new Scanner(System.in);

        while (true){

            do{
                System.out.println("Would you like to reserve a room:");
                firstAnswer = scan.next().toLowerCase();
            } while (!(firstAnswer.equals("yes")||firstAnswer.equals("no")));
            if (firstAnswer.equals("no")){
                System.out.println("have a nice day");
                break;
            }
            scan.nextLine();             // without this input line next print block are written dopple!
            do{
                System.out.println("which type of room the user wants to reserve");
                System.out.println("King Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
                System.out.println("Or enter please quit to cancel!");
                roomAnswer = scan.nextLine().toLowerCase();
            }while (!(roomAnswer.equals("king bed")|| roomAnswer.equals("queen bed")|| roomAnswer.equals("single bed")||roomAnswer.equals("quit")));

            if (roomAnswer.equals("quit")){
                System.out.println("have a nice day");
                break;
            }else {
                System.out.println("you have choosen a " + roomAnswer + " room. Thank you for your reservation.");
            }

            do{
                System.out.println("would you like to continue with more reservation?");
                System.err.println("Answer please with yes or no!");
                lastAnswer = scan.next();
            }
            while (!(lastAnswer.equals("yes")||lastAnswer.equals("no")));
            if (lastAnswer.equals("no")){
                System.out.println("have a nice day");
                break;
            }
        }



    }
}
