package day17_ClassObjectIntro;

public class AddressMainMethod {
    public static void main(String[] args) {
        Address person1 = new Address();
        person1.buildingNumber = "7925";
        person1.state = "McLean Va";
        person1.street = "Jones";
        person1.city = "Dr";
        person1.zipCode = 22012;

        System.out.println(person1);
        person1.changeZipCode(33333);

        System.out.println(person1.zipCode);

    }
}
