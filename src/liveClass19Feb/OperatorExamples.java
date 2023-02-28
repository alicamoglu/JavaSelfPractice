package liveClass19Feb;

import com.sun.security.jgss.GSSUtil;

public class OperatorExamples {
    public static void main(String[] args) {
        int age = 10;
        age++;     // TOdO ilk yazıldığı yerde sout olması şart değil işlenir
        System.out.println(age);     //11
        System.out.println(age++);   //11
        System.out.println(age);     //12

        int num = 5;
        System.out.println(++num);   //6
        System.out.println(num++);

        int x = 15;
        int y = x++;
        System.out.println(x);       //16   // TODO  ilk yazıldığı yerde henüz artmamış iken dikkat y'ye assign olur sonra ise artar dikkat
        System.out.println(y);       //15
//        ...
    }
}
