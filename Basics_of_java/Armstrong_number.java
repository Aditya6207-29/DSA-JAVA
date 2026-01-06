// To find armstrong numbers of three digit only.

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            a = a / 10;

        }
        System.out.print("The sum of cube of each digit is: " + sum + "\nHence it is a armstrong number");
    }
}
