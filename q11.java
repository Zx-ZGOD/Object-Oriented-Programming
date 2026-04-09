import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the amount");
            double balance = sc.nextFloat();
            System.out.println("Enter the balance");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new Exception("Insufficient Balance: ");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal successful.... ");
                System.out.println("Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
