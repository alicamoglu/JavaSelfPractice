package day27_staticModifiers.CydeoStudentTask;

public class CydeoStudent {
    public String name, fieldOfStudy, programingLanguage, secretCode;
    public char gender;
    public int age, batchNumber, groupNumber;

    public static String schoolName;

    static {
        schoolName = "Cydeoschool";
    }

    public CydeoStudent(String name, String fieldOfStudy, String programingLanguage, String secretCode, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.programingLanguage = programingLanguage;
        this.secretCode = secretCode;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public void printSecretCode(){
        System.out.println(secretCode);
    }
    public void attendClas(){
        System.out.println(name + " is attending Class");
    }
    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programingLanguage='" + programingLanguage + '\'' +
                ", secretCode='" + secretCode + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
2. create a class named CydeoStudent
        Variables:
        name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
        Add a constructor to initialize all the fields
        Add a static block to initialize all the statics
        methods:
        printSchoolName();
        printSecretCode();
        attendClass():
        study()
        toString()
*/
