package day25_DateTime_ConstructorsIntro;
/*Task03:
        1. Create a custom class named Carpet:
        instance variables:
        width, length, unitPrice, isPersian (boolean)
        Add a constructor that can set all the fields

        instance methods:
        calcCost(): should be able to caculate the total cost of the carpet and return it as double
        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

        total price of carpet = (width*length)*unitprice

        if the carpet is persian  carpet, add 200$ to the totalPrice*/


public class Task3_Carpet {
    public float width, length;
    public double unitPrice;
    public boolean isPersian;

    public Task3_Carpet(float width, float length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "CarpetClass{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost=$" + calcCost() +
                '}';
    }

    public double calcCost(){

//        double totalCost;//
//        return totalCost = width*length*unitPrice;
        double totalCost = width*length*unitPrice;
        return isPersian?totalCost+200:totalCost;
    }
}
