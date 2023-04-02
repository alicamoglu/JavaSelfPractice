package day19_array;

/*3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
        name - price - #ID*/
public class ArrayTask3 {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        //1. find out the first index number of "Gloves"

        System.out.println(firstIndexArrayElement(items,"Gloves"));
        
        //2. find out if "iPad" is contained in the item list
        System.out.println(isContain(items,"iPad"));

        //3. Print the report of each shopping item  :   name - price - #ID*/ 
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+"-"+ prices[i]+"-" + itemIDs[i]);

        }
    }

    public static int firstIndexArrayElement(String[] array1,String element) {
        int index = -1;           // when element not contained it gives -1 that's why is negative
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] == element){
                index = i;
                break;
            }
        }
        return index;
    }
    public static boolean isContain(String[] array1,String element) {
        int a = 0;
        for (String s : array1) {
            if(s.equals(element)){
                a++;
            }
        }
        if (a != 0){
            return true;
        }else {
            return false;
        }
    }
}
