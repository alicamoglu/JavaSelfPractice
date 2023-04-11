package day26_ConstructorsCont_StaticsIntro.PersonTask;
/*3. Person Task:
        1. Create a class named Person:
        Attributes:
        instance: name, age, gender
static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
        Add a constructor that can set All the fields (instances)
        Actions:
        eat(String food)
        drink(String drink)
        sleep()
        toString()*/
public class Person {
    public String name;
    public int age;
    public char gender;
    
    public static boolean isHuman = true, hasNose = true, hasWings = false;
    public int numberOfHead = 1, numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " eats " + food);
    }

    public void drink(String drink){ System.out.println(name + " drinks " + drink); }
    public void sleep(){ System.out.println(name + " sleeps "); }



}
