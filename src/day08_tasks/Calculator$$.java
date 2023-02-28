package day08_tasks;

public class Calculator$$ {
    public static void main(String[] args) {
        //line 46 gives error

        double n1 = 23.3,
                n2 = 10.39;
        char operator = '+';
        int result = 0;
        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Invalid operator");


//
//        double n1 = 23.3,
//                n2 = 10.39;
//        char operator = '+';
//        double result = 0;
//        switch (operator){
//            case '+':
//                result = n1 + n2;
//                break;
//            case '-':
//                result = n1 - n2;
//                break;
//            case '*':
//                result = n1 * n2;
//                break;
//            case '/':
//                result = n1 / n2;
//                break;
//
//            System.out.println(result);

        }

    }
}

    /*

        7. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

        char operator -> -, +, *, /

        when operator is + : add num1, num2
        when operator: - : minus num1, num2
        when operator: * : multiply num1, num2
        when operator: / : divide num1, num2
        for any other operators: print "invalid operator"

        Ex:
        n1 = 10, n2= 20, mathOperator = '+'

        output:
        30

        Note: MUST use switch statement
*/
