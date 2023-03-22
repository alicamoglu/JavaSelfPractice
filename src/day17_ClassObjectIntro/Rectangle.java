package day17_ClassObjectIntro;
/*3. create a custom class named Rectangle
        Attributes:
        length, width

        Actions:
        setInfo(): sets the length and width of the rectangle object
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        toString(): when a rectangle object is passed in print statement
        it should display the length, width, area and perimeter of the Rectangle object*/
public class Rectangle {
    public int length;
    public int width;

    public void setInfo(int length, int width) {
        this.length = length;                            // this is like self in Python OOP
        this.width = width;
    }

    public void calculateArea(){
        double area = length*width;
        System.out.println(area);
    }

    public void calculatePerimeter(){
        double perimeter = 2*length + 2*width;
        System.out.println(perimeter);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
