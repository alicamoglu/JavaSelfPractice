package day17_ClassObjectIntro;

/*1. Create a custom class named Car
        Attributes:
        make, model, year, color, price

        Actions:
        setInfo(): sets all the fields of the car object
        toString(): when a car object is passed in print statement, it should display all the information of the car object
        start()*/
public class Car {
    public String make;
    public String model;
    public int year;
    public String color;
    public double price;
    public String transmission;


    public void setInfo(String make, String model, int year, String color, double price,String transmission) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.transmission = transmission;

    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", transmission='" + transmission + '\'' +
                '}';
    }
    public void start(){
        System.out.println(make+ model +" starts");
    }
    public void goes(){
        System.out.println(make + model + " is " + transmission + " driven" );
    }

    public void buying(){
        System.out.println("I paid for " + color +" "+ transmission +" "+ make + " " + model + " " + "€" + price );
    }


}
