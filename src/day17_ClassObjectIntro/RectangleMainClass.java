package day17_ClassObjectIntro;

public class RectangleMainClass {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 4;
        rectangle1.width = 5;
        System.out.println(rectangle1);

        System.out.println("-".repeat(10)+ 1 + "-".repeat(10));

        Rectangle hausGarden = new Rectangle();
        hausGarden.setInfo(10,10);

        System.out.println(hausGarden);
        hausGarden.calculateArea();

        System.out.println("-".repeat(10)+ 2 + "-".repeat(10));

        Rectangle backGarden = new Rectangle();
        backGarden.setInfo(1000,3000);
        System.out.println(backGarden);
        backGarden.calculatePerimeter();
//        String name1 = backGarden.getClass().getName();   // try to bring name of the object backGarden
//        System.out.println(name1);
        System.out.print("The perimeter of backGarten is: ");
        backGarden.calculatePerimeter();
        System.out.println("-".repeat(10)+ 3 + "-".repeat(10));

        Object foo = new Object();
        String name = foo.getClass().getName();
        System.out.println(name);


    }
}
