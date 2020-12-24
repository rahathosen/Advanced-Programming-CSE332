import java.util.*;

public class App {

    public static int convertBinaryToDecimal(long num) {

        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    public static long convertDecimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1;

        while (n != 0) {
            remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }

    public static String convertBinaryToHexadecimal() {
        // int binnum, rem;
        // String hexdecnum = "";
        // char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
        // 'C', 'D', 'E', 'F' };
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter Binary Number : ");
        // binnum = scan.nextInt();
        // while (binnum > 0) {
        // rem = binnum % 16;
        // hexdecnum = hex[rem] + hexdecnum;
        // binnum = binnum / 16;
        // }

        int binnum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        binnum = scanner.nextInt();
        int descimal = convertBinaryToDecimal(binnum);
        String hexdecnum = Integer.toHexString(descimal);

        return hexdecnum;
    }

    public static int converteHxadecimalToDecimal() {
        
        return

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter Your number to Convert: \nBinary to Decimal = 1 \nDecimal to Binary  = 2 \nBinary to HexaDecimal = 3 \nHexaDecimal to Binary = 4");
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                long num = scanner.nextLong();
                int decimal = convertBinaryToDecimal(num);
                System.out.printf("%d in binary = %d in decimal", num, decimal);
                break;

            case 2:
                int num2 = scanner.nextInt();
                long binary = convertDecimalToBinary(num2);
                System.out.printf("%d in decimal = %d in binary", num2, binary);
                break;

            case 3:

                String hexadecimal = convertBinaryToHexadecimal();
                System.out.print(hexadecimal.toUpperCase());
                break;

            case 4:
                break;

            default:
                break;
        }
        scanner.close();
    }
}
