package day25_DateTime_ConstructorsIntro;
/*Task02:
        Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
        Attributes:
        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

        Add a constructor to set all the fields
        Actions:
        salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
        stateTax(): calculates the total state tax
        federalTax(): calculates the total federal tax
        salaryAfterTax(): calculates the salary after tax
        toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object*/
public class Task2_SalaryCalculator {
    double hourlyRate;
    double stateTaxRate;
    double federalTaxRate;
    int weeklyHours;

    public Task2_SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        double stateTax1 = salary() * stateTaxRate / 100 ;
        return stateTax1;
    }
    public double federalTax(){
        double federalTax1 = salary() * federalTaxRate / 100;
        return federalTax1;
    }
    public double salaryAfterTax(){
        double salaryAfterTax1 = salary() - stateTax()+federalTax();
        return salaryAfterTax1;
    }
}
