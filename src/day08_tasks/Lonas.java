package day08_tasks;

public class Lonas {
    public static void main(String[] args) {
        int Salary = 60000,
        creditScore = 650;

        String loan = (Salary > 55000 && creditScore > 600) ? "Loan Approved" :  "Loan Denied";
        System.out.println(loan);

    }
}

/*
2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

        To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650

        Otherwise print: "Loan Denied"

        NOTE: MUST USE TERNARY.

*/
