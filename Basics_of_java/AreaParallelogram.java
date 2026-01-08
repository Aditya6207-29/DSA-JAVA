// Area of parallelogram.
import java.util.Scanner;

public class AreaParallelogram{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of the parallelogram: ");
        float b = in.nextFloat();
        System.out.print("Enter height of the parallelogram: ");
        float h = in.nextFloat();
        if (b < 0 && h < 0) {
            System.out.println("Enter the parameters properly.");
        } else {
            float area = 0;
            area = b * h;
            System.out.print("The area of parallelogram is : " + area);
        }
        in.close();
    }
}