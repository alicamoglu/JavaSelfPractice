package day17_ClassObjectIntro;

public class CarMainMethod {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "honda";
        car1.model = "jazz";
        car1.year = 2005;
        car1.color = "green";
        car1.price = 1400;
        car1.transmission = "manual";



        Car car2 = new Car();
        car2.setInfo("Honda","Jazz",2004,"blue",1600,"automatic");
        System.out.println(car2);

        car2.goes();
        car1.goes();
        car2.buying();


    }
}
