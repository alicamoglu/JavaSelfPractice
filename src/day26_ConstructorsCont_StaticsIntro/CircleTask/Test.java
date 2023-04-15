package day26_ConstructorsCont_StaticsIntro.CircleTask;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println(c1);


        Circle.printPi();
        System.out.println(Circle.pi);
    }
}
