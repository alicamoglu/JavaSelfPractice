package day28_encapsulation.squareTask;

public class TestSquare {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);
        square1.setSide(2);
        System.out.println(square1);
        Square square2 = new Square(4);
        System.out.println(square2);
        Square square3 = new Square(-1);
        System.out.println(square3);

    }
}
