package TaskFromJavaReview;

import java.util.Arrays;

public class Country {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };
        System.out.println("-------------------------1------------------------------------------------");
        System.out.println(countries[0] + " " +countries[countries.length-1]);
        System.out.println("-------------------------2------------------------------------------------");
        String largest = countries[0], smallest = countries[0];
        String startsLetterC = "";
        String endsLetter_s = "";
        for (String country : countries) {
            if (country.length() < largest.length()){
                largest = country;
            }
            if (smallest.length()<country.length()){
                smallest= country;
            }
            if (country.charAt(0) == 'C'){          // if (countries[i].toLowerCase().startsWith("c")){
                startsLetterC += country+ ", ";      //this scope for task 3      ** , is against wrong separation between countries like United States
            }
            if (country.charAt(country.length()-1) == 's'){     // for task 4    or the method endsWith can be used.
                endsLetter_s += country+ " ";
            }
            
            
        }
        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);
        System.out.println("these 2 above I have misunderstood and correct below ");
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i].charAt(0)+" " + countries[i].charAt(countries[i].length()-1));
        }
        System.out.println("-------------------------3------------------------------------------------");
        System.out.println("starts with letter C = " + startsLetterC.replace(",",""));  //       that has been determined above in 2th task! the comma against wrong separating when multiword country like US has been removed.
        // other way
        String[] hasC_array = startsLetterC.split(", ");
        System.out.println(Arrays.toString(hasC_array).replace(", "," ").replace("]","").replace("[",""));

        System.out.println("-------------------------4------------------------------------------------");
        System.out.println("withLettrC = " + endsLetter_s);  //       that has been determined above in 2th task!
        System.out.println("-------------------------5------------------------------------------------");
        Arrays.sort(countries);
        System.out.println("countries sorted = " + Arrays.toString(countries));
    }
}
/*    Countries [array, String, loops]
            Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks
            String[] countries = {
            "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
            "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
            "Honduras", "Indonesia", "United States"
            };
            1- Find and print all the first and last characters
            2- Find the largest and smaller countries based on the length of their names
            3- Show all the countries that start with a 'C'
            4- Show all the countries that end with an 's'
            5- Show the countries names in alphabetical order*/

