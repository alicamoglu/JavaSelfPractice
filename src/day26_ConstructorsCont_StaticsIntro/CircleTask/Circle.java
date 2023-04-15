package day26_ConstructorsCont_StaticsIntro.CircleTask;

/*2. Circle Task:
        1. Create a class named Circle:

        Attributes:
        instance: radius, diameter
static: pi
        Add a constructor that can set All the fields (instances)
        HINT: we only need to know the radius to set the radius & diameter
        Actions:
        calcArea(): returns the area of Circle
        calcPerimeter(): returns the perimeter of Circle
        printPi(): displays PI value
        toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement*/
public class Circle {
     public double radius, diameter;
     public static float pi = 3.17f;

    public Circle() {            // this is default bu if there isn't any Constructor like below defined otherwise is must be so defined to use
        this.radius = radius;
        diameter = 2*radius;   // if instance and local variables have the same name, this should be used
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2*radius;   // if instance and local variables have the same name, this should be used
    }

    public double calcArea(){
//        double area;
//        return area = pi*radius*radius;
        return radius*radius*pi;            // easy way
    }
    public double calcPerimeter(){
        double perimeter;
        return perimeter = 2*pi*radius;
    }

    public static void printPi(){
        System.out.println("pi = "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
