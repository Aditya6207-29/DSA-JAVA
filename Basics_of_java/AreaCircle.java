// Area of circle.

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r = in.nextInt();
        if (r < 0) {
            System.out.println("Enter the radius properly.");
        } else {
            float area = 0;
            area = 3.14f * r * r;
            System.out.print("The area of circle is : " + area);
        }
        in.close();
    }
}
