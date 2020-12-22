import java.util.*;
import java.io.*;

public class App {
    public static double Addition(double a, double b) {
        return a + b;
    }

    public static double Subtraction(double a, double b) {
        return a - b;
    }

    public static double Multiplicationm(double a, double b) {
        return a * b;
    }

    public static double Division(double a, double b) {
        return a / b;
    }

    public static double Modulo(double a, double b) {
        return a % b;
    }

    // public static double Root(double a, double b) {
    // System.out.println("Number 1 or Number 2");
    // Scanner scanner = new Scanner(System.in);
    // int n = scanner.nextInt();
    // switch (n) {
    // case 1:
    // return Math.sqrt(a);
    // case 2:
    // return Math.sqrt(b);
    // default:
    // break;
    // }
    // return 0;
    // }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter your First value: ");
            double number_1 = scanner.nextDouble();
            System.out.print("Enter your Second value: ");
            double number_2 = scanner.nextDouble();
            System.out.println("Select Your Operation:\n1 = +\n2 = -\n3 = *\n4 = /\n5 = %");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println(Addition(number_1, number_2));
                    break;
                case 2:
                    System.out.println(Subtraction(number_1, number_2));
                    break;
                case 3:
                    System.out.println(Multiplicationm(number_1, number_2));
                    break;
                case 4:
                    System.out.println(Division(number_1, number_2));
                    break;
                case 5:
                    System.out.println(Modulo(number_1, number_2));
                    break;
                default:
                    break;
            }
            System.out.println("Are you want to exit Press 7 If not Press any");
            int ex = scanner.nextInt();
            if (ex == 7) {
                System.out.println("Thank You for My Service :)");
                System.exit(0);
            }

        } while (n != 7);
    }
}
