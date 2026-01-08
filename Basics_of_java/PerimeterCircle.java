// Perimeter of circle.

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = in.nextFloat();
        if (r < 0) {
            System.out.println("Invalid input.");
        } else {
            float peri = 2 * 3.14f * r;
            System.out.println("Perimeter of circle: " + peri);
        }
        in.close();
    }

}
