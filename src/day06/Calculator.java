package day06;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 42.5, n2 = 21.4;
        char mathOperator = '/';
        double outcome = 0;
    if (mathOperator == '+'){
        outcome = n1 + n2;
    }
    if (mathOperator == '-'){
        outcome = n1 - n2;
    }
    if (mathOperator == '*'){
        outcome = n1 * n2;
    }
    if (mathOperator == '/'){
        outcome = n1 / n2;
    }else{
        System.out.println("invalid operator");
    }
        System.out.println(outcome);
    }
}


/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

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

 */
