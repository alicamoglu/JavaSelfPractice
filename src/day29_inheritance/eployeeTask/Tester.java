package day29_inheritance.eployeeTask;

public class Tester {
    private String name,jobTitle;
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

    public void setInfo(String name, String jobTitle, char gender, int age, int id, double salary) {
        setName(name);//this.name = name;
        setJobTitle(jobTitle);//this.jobTitle = jobTitle;
        setGender(gender);//this.gender = gender;
        setAge(age);//this.age = age;
        setId(id);//this.id = id;
        setSalary(salary);//this.salary = salary;
    }
    public void testing(){
        System.out.println(name + " is testing");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
/*   1. Create a custom Class named Tester
        Variables:
        name, gender, age, id, jobTitle, salary
        Encapsulate all the fields
        Conditions:
        1. gender can only be 'M' or 'F'
        2. age can not be negative
        3. age MUST be between 18 to 65
        4. salary can not be negative
        Methods:
        setInfo(): sets all the fields
        testing()
        toString(): prints tester object info when the object is passed in the print statement*/
