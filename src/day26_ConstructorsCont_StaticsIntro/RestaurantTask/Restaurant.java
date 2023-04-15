package day26_ConstructorsCont_StaticsIntro.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> Servers;
    public ArrayList<Chef> Chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.Servers = new ArrayList<>();    // this 2 intantiation line 17 & 18 can be implement in line 10 & 11
        this.Chefs = new ArrayList<>();
    }

// ↓ hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
    public void hireServer(Server server){
        Servers.add(server);
    }
// ↓ hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
    public void hireServer(Server[] servers){
        Servers.addAll(Arrays.asList(servers));
    }
// ↓ hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
    public void hireChef(Chef chef){
        Chefs.add(chef);
    }
// ↓ hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
    public void hireChef(Chef[] chefs){
        Chefs.addAll(Arrays.asList(chefs));
    }
// ↓ terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
    public void terminateChef(int employeeID){
        Chefs.removeIf(p->p.employeeID == employeeID);
    }
// ↓ terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server
    public void terminateServer(int employeeID){
        Servers.removeIf(p->p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Number of Servers=" + Servers.size() +
                ", Number of Chefs=" + Chefs.size() +
                '}';
    }
}
/*        4.3 Create a class called Restaurant
        Attributes:
        Owner (String), Location (String), numberOfStars (int)
        Servers (ArrayList of Server objects)
        Chefs (ArrayList of Chef objects)
        Add a constructor that sets the owner, location, and number of stars.
        Actions: (all void methods)
        hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
        hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
        hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
        hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
        terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
        terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server
        toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information
    */

