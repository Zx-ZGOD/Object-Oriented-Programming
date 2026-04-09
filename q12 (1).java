import java.util.Scanner;

class DivisionCalculator {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter First No: ");
            n1 = sc.nextInt();
            System.out.println("Enter the Second No: ");
            n2 = sc.nextInt();

            n2 = 18 / n1;
            System.out.println("Result = " + n2);
        } catch (ArithmeticException e) {
            System.out.println(e);

        }
    }

}