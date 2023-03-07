package day11_string;

public class EmailTask2 {
    public static void main(String[] args) {
/*
    7. Create a class called EmailTask2.
    Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that will print out information about user based on email. Print first name, last name, and domain.

    First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
    Ex:
    input:
    craig_federighi@apple.com

    Output:
    First name: Craig
    Last name: Federighi
    Domain: apple
    */
        String email= "mike_tyson@gmail.com";
        String fName = email.substring(0,email.indexOf("_"));
        String lName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf(".com"));

        System.out.println("First name: "+ fName);
        System.out.println("Last name: "+ lName);
        System.out.println("Domain: "+ domain);

    }
}
