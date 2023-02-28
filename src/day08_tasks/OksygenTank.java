package day08_tasks;

public class OksygenTank {
    public static void main(String[] args) {
        int levelNum = 77;

        String message =   (levelNum > 90) ? "Your tank is full":
            (levelNum > 80) ? "Still okay":
            (levelNum > 70) ? "Don't go too far":
            (levelNum > 60) ? "Start to head back":
            (levelNum > 50) ? "Be careful now you at 50%":"";
        System.out.println(message);
    }
}

/*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you at at 50%

        USE ONE PRINT STATEMENT ONLY

        Solution 1: Must use ternary
*/
