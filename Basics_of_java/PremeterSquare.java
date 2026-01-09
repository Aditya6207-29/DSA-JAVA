
//Perimeter Of Square.
//Perimeter Of Rhombus.
import java.util.Scanner;

public class PremeterSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side: ");
        float a = in.nextFloat();

        if (a < 0) {
            System.out.println("Invalid input");
        } else {
            float p = 4 * a;
            System.out.println("Perimeter Of Square: " + p);
        }
        in.close();
    }
}