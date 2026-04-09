import java.util.InputMismatchException;
import java.util.Scanner;

class StudentInputSystem {
    public static void main(String[] args) {
        // int age = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the age: ");
            int age = sc.nextInt();

            int check = 10 / age;
            System.out.println("Student age: " + age);

        } catch (InputMismatchException e) {
            System.out.println("invalid input..");
        }

        catch (ArithmeticException e) {
            System.out.println("invalid input..");
        }

        sc.close();

    }

}
