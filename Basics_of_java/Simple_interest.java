// Program to calculate simple interest

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        float P = in.nextFloat();
        System.out.print("Enter rate of interest: ");
        float R = in.nextFloat();
        System.out.print("Enter time in years: ");
        float T = in.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println("Simple Interest is: " + SI);
        in.close();
    }

}
