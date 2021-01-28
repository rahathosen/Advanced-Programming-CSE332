import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name, accountnumber, type;
        double amount;
        double balance = 0;

        System.out.print("Enter name:");
        name = input.nextLine();
        System.out.print("Enter Acnumber:");
        accountnumber = input.nextLine();
        System.out.print("Enter type:");
        type = input.nextLine();
        System.out.print("Enter amount:");
        amount = input.nextDouble();

        System.out.println("");
        Bank bank = new Bank(name, accountnumber, type, amount);
        bank.display();

    }

}