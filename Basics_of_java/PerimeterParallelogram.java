
//Perimeter Of Parallelogram & Rectangle.
import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length and breath: ");
        float l = in.nextFloat();
        float b = in.nextFloat();

        if (l < 0 || b < 0) {
            System.out.println("Invalide input");
        } else {
            float p = 2 * (l + b);
            System.out.print("Perimeter Of Parallelogram: " + p);
        }
        in.close();
    }
}
