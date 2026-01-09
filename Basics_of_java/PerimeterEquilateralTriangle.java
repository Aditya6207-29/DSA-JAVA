// Perimeter Of Equilateral Triangle.

import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        float a = in.nextFloat();
        if (a < 0) {
            System.out.println("Invalid input");
        } else {
            float p = 3 * a;
            System.out.print("Perimeter Of Equilateral Triangle: " + p);
        }
        in.close();
    }
}
