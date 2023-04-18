package day29_inheritance.eployeeTask;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {
    private String name, jobTitle, programmingLanguage;
    private char gender;
    private int age, id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
            System.err.println("Invalid entry for gender" + gender + "\n enter please either M or F!");
            System.exit(1);
        }

        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Invalid age" + age + "age can not be zero or negative!");
            System.exit(1);
        }
        if(age<18 || age>65){
            System.err.println("Invalid age" + age + "age should be between 18 and 65");
            System.exit(1);
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("salary can not be zero or negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    String [] languageArray = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"};
    ArrayList<String > languageArrayList = new ArrayList<>(Arrays.asList(languageArray));
    public void setProgrammingLanguage(String programmingLanguage) {
        if (!(languageArrayList.contains(programmingLanguage))){
            System.err.println("Invalid programing language entry: " + programmingLanguage + "\n enter please among " + Arrays.toString(languageArray).replace("[","").replace("]",""));
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void setInfo(String name, String jobTitle, String programmingLanguage, char gender, int age, int id, double salary) {
        setName(name);//this.name = name;
        setJobTitle(jobTitle);//this.jobTitle = jobTitle;
        setProgrammingLanguage(programmingLanguage);//this.programmingLanguage = programmingLanguage;
        setGender(gender);//this.gender = gender;
        setAge(age);//this.age = age;
        setId(id);//this.id = id;
        setSalary(salary);//this.salary = salary;
    }
    public void coding(){
        System.out.println(name + " is coding");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*	2. Create a custom Class named Developer
            Variables:
            name, gender, age, id, jobTitle, salary, programmingLanguage
            Encapsulate all the fields
            Conditions:
            1. gender can only be 'M' or 'F'
            2. age can not be negative
            3. age MUST be between 18 to 65
            4. salary can not be negative
            5. programming language can only be set to one of the followings:
            {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
            Methods:
            setInfo(): sets all the fields (including programmingLanguage)
            coding()
            toString(): prints developer object info when the object is passed in the print statement*/
