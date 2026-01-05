// To calculate fibonacci series up to n terms

import java.util.Scanner;

public class Fibonacci_series{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter teh number of terms for Fibonacci series: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            
        }
        in.close();
    }
}