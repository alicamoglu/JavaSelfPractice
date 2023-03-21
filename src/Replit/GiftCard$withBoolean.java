package replit;

import java.util.Scanner;

public class GiftCard$withBoolean {
    //https://replit.com/@javab29/I-Gift-Card-alicamoglu#README.md
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int Blanket = 60;
            int Charger = 5;
            int Hat = 25;
            int Headphones = 30;
            int Laptop = 200;
            int Pants = 50;
            int Pillow = 40;
            int Smartphone = 1000;
            int Socks = 5;
            int USB_cable = 10;

            int giftCard = 100;
            System.out.println("Hello, which item would you like?");
            String answer = input.nextLine();
                switch (answer){
                    case "Blanket":
                        giftCard -=60;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "Charger":
                        giftCard -= 5;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "Hat":
                        giftCard -=25;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "Headphones":
                        giftCard -=30;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "Laptop ":
                        System.out.println("Sorry, not enough funds on your gift card");
                        break;
                    case "Pants":
                        giftCard -=50;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "Pillow":
                        giftCard -=40;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "Smartphone":
                        System.out.println("Sorry, not enough funds on your gift card");
                        break;
                    case "Socks":
                        giftCard -=5;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    case "USB_cable":
                        giftCard -=10;
                        System.out.println("Thank you for your purchase!");
                        System.out.println("Your current balance is: "+giftCard+"$");
                        break;
                    default:
                        System.out.println("Sorry, that is an invalid item");
                }






        }


    }
}
