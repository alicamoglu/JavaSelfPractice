package Replit.Item;

public class Item {
        public String name;
        public double price;

        public Item(String name, double price) {
                this.name = name;
                this.price = price;
        }

        public String toString() {
            return name + "- $"+ price;
        }
}
/*
### Create the `Item.java` file according the following requirements. The `Main` class will use the Item class objects to test different scenarios.
        - declare these `instance variables`:
        - name (String)
        - price (double)
        - create this `constructor` to initialize the variables:
        - 2 argument: name, price
        - create a `toString()` method  to disply the object in this format:
        > $itemName - $itemPrice

        #### Main topics: class & object, instance variables, constructors, toString
        Example:
        ```
        Item item = new Item("Folder", 4.99);
        System.out.println(item);
        Output:
        Folder - $4.99
*/