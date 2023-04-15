package day26_ConstructorsCont_StaticsIntro.RestaurantTask;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server server1 = new Server("haci",2612445,15,false, LocalDate.of(2022,3,23));
        Server server2 = new Server("aaa",566456,8,false,LocalDate.of(2011,7,9));
        Server server3 = new Server("bbb",346551,5,true,LocalDate.of(2017,4,19));
        Server server4 = new Server("ccc",987988,7,false,LocalDate.of(2022,1,31));

        System.out.println(server1);
        server1.takeOrder();

        Chef chef1 = new Chef("naci",51448626,20,true);//,LocalDate.of(2018,8,11));
        chef1.washDishes();
        System.out.println(chef1);

        System.out.println("___________________1_________________________");

        Server[] servers = {server2,server3,server4};
        System.out.println(Arrays.toString(servers));

        Restaurant restaurant = new Restaurant("Kenan","fdst",3);

        restaurant.hireChef(chef1);
        restaurant.hireServer(servers);

        System.out.println(restaurant);

    }
}
 /*     4.4. Create a class LocalRestaurant that has a main method with the following:
        - Make a Restaurant object
        - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
        - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object
        - Print your whole restaurants information*/