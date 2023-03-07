package day11_string;

public class EmailTask1 {
    public static void main(String[] args) {

    /*  6. Create a class calledEmailTask1.
    Assume that email address is constructed by person's first name and followed by an underscore and last name.
    Write a program that can swap first name with last name in the email (Separated by an underscore).If the email doesn't contain an underscore print the given input email.
    Ex:   input: mike_tyson@gmail.com
          output: tyson_mike@gmail.com*/
        String email= "mike_tyson@gmail.com";
        String fName = email.substring(0,email.indexOf("_"));
        String lName = email.substring(email.indexOf("_")+1,email.indexOf("@"));

        System.out.println(fName);
        System.out.println(lName);
//        email = email.replace()
        email = lName + "_" + fName + email.substring(email.indexOf('@'));
        System.out.println(email);
    }
}