package day28_encapsulation.squareTask;

public class Square {
    private double side;

    public void setSide(double side) {
        if (side<=0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public double getSide() {

        return side;
    }

    public Square(double side) {
//        this.side = side;     //todo  if this line is used instead of the line just below then condition set in setSide method will not work and negative entry can not be blocked.
        setSide(side);
    }
    public Square() {

    }
    public double calcArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area of square=" + calcArea() +
                "perimeter of square=" + calcPerimeter() +
                '}';
    }
}
/*2. Create a class named Square:
        Private variables:
        side
        Encapsulate all the fields
        Condition:
        side of the square should not be negative
        Add a constructor that allows user to set all the fields when the object is created.
        Methods:
        calcArea(): returns the area of square
        calcPerimeter(): returns the perimeter of square
        toString(): can display the side, area, perimeter of square when object is passed in print statement*/
