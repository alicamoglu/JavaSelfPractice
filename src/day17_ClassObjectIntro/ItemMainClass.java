package day17_ClassObjectIntro;

public class ItemMainClass {
    public static void main(String[] args) {
        Item meat = new Item();
        meat.setInfo("meat cow",13.90,5);

        System.out.println(meat.quantity + "kg " + meat.name +" total price: " + meat.calcCost());

    }
}
