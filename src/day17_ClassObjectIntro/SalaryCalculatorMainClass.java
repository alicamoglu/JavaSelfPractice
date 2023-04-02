package day17_ClassObjectIntro;

public class SalaryCalculatorMainClass {
    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator();
        salary1.hourlyRate = 55;
        salary1.weeklyHours = 45;
        salary1.stateTaxRate = 7.5;
        salary1.federalTaxRate = 24.5;

        System.out.println("salary1 state tax: " + salary1.stateTax());

        SalaryCalculator daimlerSDET = new SalaryCalculator();
        daimlerSDET.setInfo(66,38,8,25);

        System.out.println("salary of daimler SDET: " + daimlerSDET.salary());




    }





}


//    double hourlyRate = 55,
//            weeklyHours = 45;
//    double stateTaxRate = 7.5; // implicit casting
//    double federalTaxRate = 24.5;

//        System.out.println("Gross pay is: $" + salaryBeforeTax);
//                System.out.println("Federal tax is: $" + federalTax);
//                System.out.println("State tax is: $" + stateTax);
//                System.out.println("Total tax is: $" + totalTax);
//                System.out.println("Net income is: $" + salaryAfterTax);