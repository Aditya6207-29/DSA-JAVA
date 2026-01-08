
// Area of equilateral triangle.
import java.util.Scanner;

public class AreaEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        float s = in.nextFloat();

        if (s < 0) {
            System.out.println("Invalid input.");
        } else {
            float area = 0;
            area = (1.73f / 4) * s * s;
            System.out.println("Area: " + area);
        }
        in.close();
    }
}