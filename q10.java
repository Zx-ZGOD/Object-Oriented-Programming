import java.util.Scanner;

class PasswordMakingSystem {
    String password;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password: ");
        password = sc.nextLine();

        if (password.length() <= 2) {
            System.out.println("Masked Password: " + password);
        } else {
            String firstPart = password.substring(0, password.length() - 2);
            String lastPart = password.substring(password.length() - 2);

            String masked = firstPart.replace(firstPart, "*".repeat(firstPart.length()));

            System.out.println("Masked Password: " + masked + lastPart);
        }
    }

}

public class q10 {

    public static void main(String[] args) {
        PasswordMakingSystem p = new PasswordMakingSystem();
        p.accept();
    }
}
