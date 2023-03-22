package day17_ClassObjectIntro;
/*2. Create a custom class named Student
        Attributes:
        name, gender, age, studentId, grade, isFullTime

        Actions:
        setInfo(): sets all the fields of the student object
        toString(): when a car object is passed in print statement,
        it should display all the information of the student object
        study()*/
public class Student {
    public String name;
    public char gender;
    public int age,
                studentId,
                grade;
    boolean isFullTime;

    public void setInfo(String name, char gender, int age, int studentId, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
    public void study(){
        String backTo;
        if (!isFullTime){
            backTo = "is moon back home";
        } else{
            backTo = "is evening back home";
        }
        System.out.println(name + " is " + age + " years old " + backTo);
    }
}
