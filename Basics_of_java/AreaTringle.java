// Area of triangle , same for isosecles triangle.
import java.util.Scanner;
public class AreaTringle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of the tringle: ");
        float b = in.nextFloat();
        System.out.print("Enter height of the tringle: ");
        float h = in.nextFloat();
        if (b < 0 && h < 0) {
            System.out.println("Enter the parameters properly.");
        } else {
            float area = 0;
            area = 0.5f * b * h;
            System.out.print("The area of circle is : " + area);
        }
        in.close();
    }
}
