
// Area Of Rhombus.
import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of the Rhombus: ");
        float b = in.nextFloat();
        System.out.print("Enter height of the Rhombus: ");
        float h = in.nextFloat();
        if (b < 0 && h < 0) {
            System.out.println("Enter the parameters properly.");
        } else {
            float area = 0;
            area = b * h;
            System.out.print("The area of circle is : " + area);
        }
        in.close();
    }
}
