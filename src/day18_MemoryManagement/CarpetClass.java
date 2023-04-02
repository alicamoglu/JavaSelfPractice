package day18_MemoryManagement;
/*
4. Create a class named Carpet:
        Attributes:
        width
        length
        unitPrice
        isPersian
        Actions:
        setInfo(): sets all the fields
        calcCost(): should be able to calculate the total cost of the carpet and return it as double
        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
        total price of carpet = (width*length) * unit-price
        if the carpet is Persian  carpet, add 200$ to the totalPrice
        */

public class CarpetClass {
    public float width, length;
    public double unitPrice;
    public boolean isPersian;

    public void setInfo(float width, float length, double unitPrice, boolean isPersian) {
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
                '}';
    }

    public double calcCost(){

//        double totalCost;//
//        return totalCost = width*length*unitPrice;
        double totalCost = width*length*unitPrice;
        return isPersian?totalCost+200:totalCost;
    }
}
