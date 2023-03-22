package day17_ClassObjectIntro;

public class StudentMainMethod {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "kamil";
        student1.gender = 'M';
        student1.age = 11;
        student1.studentId= 1111;
        student1.grade = 4;



        Student student2 = new Student();
            student2.setInfo("Ali",'M',10, 5742,2,true);


    }
}
