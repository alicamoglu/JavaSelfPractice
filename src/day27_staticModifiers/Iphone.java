package day27_staticModifiers;
/*1. Create a class named Iphone
        variables:
        brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn
        Add a constructor to initialized all the fields
        Add a static block to initialize all the statics
        Methods:
        printOperatingSystem(): displays the operating system of the iphone
        call(long phoneNumber)
        text(long phoneNumber)
        faceTime(long phoneNumber)
        faceTime(String email)
        toString()*/
public class Iphone {
    public String brand, model, color;
    public char size;
    public double price;
    public static String OS,madeIn,designedIn;
    public static boolean isSmartPhone;
    static {
        OS = "IOS";
        madeIn = "China";
        designedIn = "USA";
        isSmartPhone = true;
    }
    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber);
    }

}
