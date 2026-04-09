import java.util.Scanner;

class EmailChecker {
    String EmailChecker;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the E-mail: ");
        EmailChecker = sc.nextLine();

        if (EmailChecker.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address..");
        } else {
            System.out.println("Invalid Email...");
        }
    }
}

public class q2 {

    public static void main(String[] args) {
        EmailChecker e = new EmailChecker();
        e.accept();
    }
}
