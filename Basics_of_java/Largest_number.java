
// largest of two numbers.
import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.print("The first number is largest: " + a);
        } else if (b > a) {
            System.out.print("The second number is largest: " + b);
        } else {
            System.out.print("Both numbers are equal.");
        }
        in.close();
    }
}
