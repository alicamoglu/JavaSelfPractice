package Replit;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {
        float finalPrice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = input.nextLine();
        System.out.println("Select CPU type:");
        String CPU = input.nextLine();
        System.out.println("Select RAM size:");
        byte ram = input.nextByte();
        input.nextLine();
        System.out.println("Select storage type:");
        String storageType = input.nextLine();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        input.nextLine();
        System.out.println("Select screen resolution:");
        String screenResolution = input.nextLine();

        switch (screenSize){
            case "13.3":
                finalPrice += 200;
                break;
            case "15.0":
                finalPrice += 300;
                break;
            case "17.3":
                finalPrice += 400;
        }

        switch (CPU){
            case "i3":
                finalPrice += 150;
                break;
            case "i5":
                finalPrice += 250;
                break;
            case "i7":
                finalPrice += 350;
        }

        finalPrice += 50*(ram/4);         // price addition for any 4 GB more chosen ram

        if (storageType.equals("HDD")){     // price addition for any 500 GB more chosen storage regarding tpye as wall
            finalPrice += 50*(storageSize/500);
        }else if(storageType.equals("SSD")){
            finalPrice += 100*(storageSize/500);
        }
        if (screenResolution.equals("FULLHD")){
            finalPrice += 100;
        }else if(screenResolution.equals("4K")){
            finalPrice += 200;
        }



        System.out.println("Final price is: $"+finalPrice);

    input.close();
    }
}




