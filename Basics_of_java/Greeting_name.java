//Taking a name as input and printing a greeting message of that name.

import java.util.Scanner;

public class Greeting_name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        in.close();
    }

}