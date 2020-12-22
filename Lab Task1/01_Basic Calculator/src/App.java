import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

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

    public static double Square(double a, double b) {

        System.out.println("Which Square ? Number 1 or Number 2");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = 0.0;
        if (n == 1) {
            x = (a * a);
        }
        if (n == 2) {
            x = (b * b);
        }
        return x;
    }

    public static double Root(double a, double b) {
        System.out.println("Which Square root? Number 1 or Number 2");
        DecimalFormat formatter = new DecimalFormat("#0.00");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = 0.0;
        if (n == 1) {
            x = Math.sqrt(a);
        }
        if (n == 2) {
            x = Math.sqrt(a);
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter your First value: ");
            double number_1 = scanner.nextDouble();
            System.out.print("Enter your Second value: ");
            double number_2 = scanner.nextDouble();
            System.out.println("Select Your Operation:\n1 = +\n2 = -\n3 = *\n4 = /\n5 = %\n6 = Square\n7 = SquareRoot");
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
                case 6:
                    System.out.printf("%.2f\n", Square(number_1, number_2));
                    break;
                case 7:
                    System.out.printf("%.2f\n", Root(number_1, number_2));
                    break;
                default:
                    break;
            }
            System.out.println("Are you want to exit Press 7 If not Press any");
            int ex = scanner.nextInt();
            if (ex == 8) {
                System.out.println("Thank You for My Service :)");
                System.exit(0);
            }
        } while (n != 7);
    }
}
