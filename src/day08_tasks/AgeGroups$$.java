package day08_tasks;

public class AgeGroups$$ {
    public static void main(String[] args) {
//              // properly ran
//        String ages = "Pre-Teen";
//
//        String ageGroup = (ages.equals("infant")) ? "(1 - 2)":
//                          (ages.equals("Toddler")) ? "(3 - 5)":
//                          (ages.equals("Kid")) ? "(6 - 9)":
//                          (ages.equals("Pre-Teen")) ? "(10 - 12)":
//                          (ages.equals("Teenager")) ? "(13 - 17)":
//                          (ages.equals("Young Adult")) ? "(18 - 20)":
//                          (ages.equals("Adult")) ? "(21 - 39)":
//                          (ages.equals("Young Middle-Aged Adult")) ? "(40 - 49)":
//                          (ages.equals("Middle-Aged Adult")) ? "(50 - 54)":
//                          (ages.equals("Very Young Senior Citizen")) ? "(55 - 64)":
//                          (ages.equals("Young Senior Citizen")) ? "(65 - 74)":
//                          (ages.equals("Senior Citizen")) ? "(75 - 84)":
//                          (ages.equals("Old Senior Citizen")) ? "(85+)": "";
//        System.out.println("ageGroup = " + ageGroup);
        System.out.println("-----------------seperator-----------------------------------");

//        //  properly ran
//        String ages = "Pre-Teen";
//        String ageGroup = (ages =="infant") ? "(1 - 2)":
//                          (ages =="Toddler") ? "(3 - 5)":
//                          (ages =="Kid") ? "(6 - 9)":
//                          (ages =="Pre-Teen") ? "(10 - 12)":
//                          (ages =="Teenager") ? "(13 - 17)":
//                          (ages =="Young Adult") ? "(18 - 20)":
//                          (ages =="Adult") ? "(21 - 39)":
//                          (ages =="Young Middle-Aged Adult") ? "(40 - 49)":
//                          (ages =="Middle-Aged Adult") ? "(50 - 54)":
//                          (ages =="Very Young Senior Citizen") ? "(55 - 64)":
//                          (ages =="Young Senior Citizen") ? "(65 - 74)":
//                          (ages =="Senior Citizen") ? "(75 - 84)":
//                          (ages =="Old Senior Citizen") ? "(85+)": "";
//        System.out.println("ageGroup = " + ageGroup);


        int age = 41;
//
        String ageGroup = (1 <=age && age <=2 ) ? "infant":
                          (3 <=age && age <=5 ) ? "Toddler":
                          (6 <=age && age <=9 ) ? "Kid":
                          (10 <=age && age <=12 ) ? "Pre-Teen":
                          (13 <=age && age <=17 ) ? "Teenager":
                          (18 <=age && age <=20 ) ? "Young Adult":
                          (21 <=age && age <=39 ) ? "Adult":
                          (40 <=age && age <=49 ) ? "Young Middle-Aged Adult":
                          (50 <=age && age <=54 ) ? "Middle-Aged Adult":
                          (55 <=age && age <=64 ) ? "Very Young Senior Citizen":
                          (65 <=age && age <=74 ) ? "Young Senior Citizen":
                          (75 <=age && age <=84) ? "Senior Citizen":
                          (85 <=age ) ? "Old Senior Citizen":"";
        System.out.println("ageGroup = " + ageGroup);


            
    }
}

/*

3. Create a class called AgeGroups
        write a program that can define the age groups of a person

        age groups are:
        infant (1 - 2)
        Toddler (3 - 5),
        Kid (6 - 9),
        Pre-Teen (10 - 12),
        Teenager (13 - 17),
        Young Adult (18 - 20),
        Adult (21 - 39),
        Young Middle-Aged Adult (40 - 49),
        Middle-Aged Adult (50 - 54),
        Very Young Senior Citizen (55 - 64),
        Young Senior Citizen (65 - 74),
        Senior Citizen (75 - 84),
        Old Senior Citizen (85+)

        Note: MUST use ternary

*/
