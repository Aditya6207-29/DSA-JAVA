
// Take input as rupees and give output as USD dollars.
import java.util.Scanner;

public class Currency_convertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your amount in rupees: ");
        double rs = in.nextDouble();
        double USD = rs / 90.31;
        System.out.println("Your amount in USD dollars is: " + USD);
        in.close();
    }
}
