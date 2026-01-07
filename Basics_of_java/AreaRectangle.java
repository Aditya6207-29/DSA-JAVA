
// Area Of Rectangle Program.
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length: ");
        float len = in.nextFloat();
        System.out.print("Enter the breath: ");
        float bre = in.nextFloat();

        if (len < 0 && bre < 0) {
            System.out.println("Invalid input.");
        } else {
            float area;
            area = len * bre;
            System.out.println("The area of the rectangle: " + area);
        }
        in.close();
    }
}
