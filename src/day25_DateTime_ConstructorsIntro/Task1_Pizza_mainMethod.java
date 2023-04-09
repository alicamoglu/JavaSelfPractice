package day25_DateTime_ConstructorsIntro;

public class Task1_Pizza_mainMethod {
    public static void main(String[] args) {
//        Task1_Pizza pizza1 = new Task1_Pizza();          //than if a Constructor exists default one no more to use.
//        pizza1.size= 'M';
//        pizza1.numberOfCheeseTopping= 2;
//        pizza1.numberOfPepperoniTopping = 4;
//        System.out.println(pizza1);

//        pizza1.setInfo('M',2,5);
        Task1_Pizza pizza2 = new Task1_Pizza('M',2,5);
        System.out.println(pizza2);
    }
}
