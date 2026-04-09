import java.util.Scanner;

class StudentNameComparison {
    String name1;
    String name2;

    void Campare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        name1 = sc.nextLine();
        System.out.println("Enter the Second name: ");
        name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Case sensetive: ");
        } else if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-Insensetive: ");
        } else {
            System.out.println("Executed At the end....");
        }

    }
}

public class q3 {

    public static void main(String[] args) {
        StudentNameComparison s = new StudentNameComparison();
        s.Campare();
    }
}
