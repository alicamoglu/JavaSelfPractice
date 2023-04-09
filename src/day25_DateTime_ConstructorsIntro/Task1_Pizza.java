package day25_DateTime_ConstructorsIntro;

/*Task01:
        Create a custom class named Pizza:
        Attributes:
        size, numberOfCheeseTopping, numberOfPepperoniTopping
        Add a constructor that can set all the fields
        Actions:
        calcCost(): returns the totalCost of the pizza
        toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
        S: $10 + $2 per topping
        M: $12 + $2 per topping
        L: $14 + $2 per topping*/
public class Task1_Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

//    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
//        this.size = size;
//        this.numberOfCheeseTopping = numberOfCheeseTopping;
//        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
//    }

    public Task1_Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Task1_Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }

    public double calcCost(){
        double totalCost = 0;
        switch (size){
            case 'S':
                totalCost = 10;
                break;
            case 'M':
                totalCost = 12;
                break;
            case 'L':
                totalCost = 14;
                break;
        }
        return totalCost += (numberOfCheeseTopping*2 + numberOfPepperoniTopping*2);
    }
}
