import java.util.Scanner;

class Username {
    String username;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        username = sc.nextLine();
    }

    void remove() {
        username = username.trim();
        username = username.toLowerCase();
    }

    void displayData() {
        System.out.println("Cleaned Username: " + username);
    }
}

public class q1 {

    public static void main(String[] args) {
        Username u = new Username();
        u.accept();
        u.remove();
        u.displayData();
    }
}
