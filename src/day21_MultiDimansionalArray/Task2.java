package day21_MultiDimansionalArray;
/*2. Given the Array:
        String[][] items = {
        {"Apple", "Banana", "Grape", "Avocado"},
        {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
        {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        1. print the following output: (add \t between two words)
        Apple    Banana   Grape    Avocado
        Paper Towels     Toilet Papers   Tissues    Diapers
        Coke   Fanta   Arizona Tea   Pepsi   Water

        2. print the following output: (add \t between two words)
        Avocado   Grape    Banana    Apple
        Diapers   Tissues   Toilet Papers   Paper Towels
        Water    Pepsi    Arizona Tea    Fanta   Coke

        3. print the following output: (add \t between two words)
        Coke   Fanta   Arizona Tea   Pepsi   Water
        Paper Towels     Toilet Papers   Tissues    Diapers
        Apple    Banana   Grape    Avocado*/
public class Task2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (int i = 0; i < items.length; i++) {
            String [] anyth = items[i];
            System.out.println();        // ++++++++++++++++++++++++++++without this all in one line!
            for (int i1 = 0; i1 < anyth.length; i1++) {
                System.out.print(anyth[i1]+"\t");
            }
        }
        System.out.println();     //+++++++++++++without this print cursor stays previous line
        System.out.println("+".repeat(15)+1+"+".repeat(15));

        for (int i = 0; i < items.length; i++) {
            String [] anyth = items[i];
            System.out.println();        // ++++++++++++++++++++++++++++without this all in one line!
            for (int i1 = anyth.length-1; 0<= i1  ; i1--) {
                System.out.print(anyth[i1]+"\t");
            }

        }
        System.out.println();     //+++++++++++++without this print cursor stays previous line
        System.out.println("+".repeat(15)+2+"+".repeat(15));

        for (int i = items.length-1; 0<=i  ; i--) {
            String [] anyth = items[i];
            System.out.println();        // ++++++++++++++++++++++++++++without this all in one line!
            for (int i1 = 0; i1 < anyth.length; i1++) {
                System.out.print(anyth[i1]+"\t");
            }
        }





    }
}
