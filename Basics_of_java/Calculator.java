
//Take two numbers and an operator(+,-,*,/) and calculate the result. (using if conditions)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        if (operator == '+') {
            System.out.print("Result: " + (num1 + num2));
        }
        else if (operator == '-') {
            System.out.print("Result: " + (num1 - num2));
        }
        else if (operator == '*') {
            System.out.print("Result: " + (num1 * num2));
        }
        else if (operator == '/') {
            if (num2 != 0) {
                System.out.print("Result: " + (num1 / num2));
            } else {
                System.out.print("Error: Division by zero is not allowed.");
            }

        } else {
            System.out.print("Invalid operator!");
        }
        in.close();

    }
}