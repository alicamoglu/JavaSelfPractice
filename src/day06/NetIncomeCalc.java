package day06;

public class NetIncomeCalc {
    public static void main(String[] args) {
        double salary = 110,
                tax = 0;
        boolean isMarried = true;

        if (salary >= 130) {
            tax = 35;
        }
        if (130> salary && salary >= 100) {
            tax = 30;
        }
        if (100 > salary && salary >= 80) {
            tax = 25;
        }
        if (salary <= 79) {
            tax = 20;
        }
        if (isMarried == true){
            tax *= 0.95;
        }
        System.out.println("tax = " + tax + "%");
    }
}

/*
9. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
        the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 129K
        25% for salary of 80K to 99K
        20% for salary of 79K or less

        in addition, if the person is married, he/she will pay 5% less tax
*/
