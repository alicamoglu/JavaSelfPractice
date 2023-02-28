package day08_tasks;

public class NumberOfDays {
    public static void main(String[] args) {

/*        int month = 5;
        switch (month){
           case  1 || 3 || 5 || 7 || 8 || 10 || 12:
            System.out.println(31);
               break;
            case 4|| 6|| 9|| 11:
                System.out.println(31);
            break;*/
//   !! switch does not except boolean in case however || is a boolean operator
//    instead of that     ↓
        int month = 15;
        String resultDayNumber = "";
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                resultDayNumber = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                resultDayNumber = "30 days";
                break;
            case 2:
                resultDayNumber = "28 days";
            default:
                resultDayNumber ="invalid";
        }
        System.out.println(resultDayNumber);
//
//        the numbers have been above back to back put in one break also one of them is met then comes the same result that is in or logic but in switch there is no usage of and logic like this
        // and here is seen that no need precondition for default (like else) in switch
    }
}

/*
    2. Create a class named NumberOfDays. An integer variable named month is given
        Use switch statement to write a program that can find the number of days in the given number of month.

        EX:
        month = 5

        output:
        31 days

        (Assume that February has 28 days)

        Hints:
        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days: 4, 6, 9, 11
*/

