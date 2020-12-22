import java.util.*;
import java.io.*;

public class App {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        double number_1 = scanner.nextDouble();
        double number_2 = scanner.nextDouble();

        System.out.println("Select Your Operation:\n1 = +\n2 = -\n3 = *\n4 = /");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println(sum(number_1, number_2));
                break;

            default:
                break;
        }
    }
}
