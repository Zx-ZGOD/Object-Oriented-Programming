import java.util.Scanner;

class MessageFormatter {
    String First;
    String Last;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        First = sc.nextLine();
        System.out.println("Last Name: ");
        Last = sc.nextLine();

        System.out.println(First.concat(Last));
    }
}

public class q4 {

    public static void main(String[] args) {
        MessageFormatter m = new MessageFormatter();
        m.accept();
    }
}
