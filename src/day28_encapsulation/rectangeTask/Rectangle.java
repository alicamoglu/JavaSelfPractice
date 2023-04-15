package day28_encapsulation.rectangeTask;

public class Rectangle {
    private double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width: " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
//        this.width = width; // todo here is the most important to control the condition otherwise any antry is possible
//        this.length = length;
        setWidth(width);
        setLength(length);
    }
    public double calcArea(){
        return length*width;
    }
    public double calcPerimeter(){
        return 2*length + 2*width;         //todo area and perimeter will can be negative determined also if in Constructor with is used instead of setWidth
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area of rectangle=" + calcArea() +
                ", perimeter of rectangle=" + calcPerimeter() +
                ", length=" + length +
                '}';
    }
}
/*3. Create a class named Rectangle:
        Private variables:
        width, length
        Encapsulate all the fields
        Conditions:
        width of the rectangle should not be negative
        length of the rectangle should not be negative
        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)
        Methods:
        calcArea(): returns the area of rectangle
        calcPerimeter(): returns the perimeter of rectangle
        toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement*/
