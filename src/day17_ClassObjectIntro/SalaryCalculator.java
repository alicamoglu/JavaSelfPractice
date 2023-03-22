package day17_ClassObjectIntro;
/*
4. Create a custom class named SalaryCalculator
    Attributes:
    hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
    (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)
    Actions:
    setInfo(): sets all the fields of SalaryCalculator object
    salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
    stateTax(): calculates the total state tax, and returns it as double
    federalTax(): calculates the total federal tax, and returns it as double
    salaryAfterTax(): calculates the salary after tax, and returns it as double
    toString(): when a SalaryCalculator object is passed in print statement,
    it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object
*/
public class SalaryCalculator {
    double hourlyRate;
    double stateTaxRate;
    double federalTaxRate;
    int weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
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
