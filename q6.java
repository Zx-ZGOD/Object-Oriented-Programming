import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    String s;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s);
        System.out.println(st.countTokens());

    }
}

public class q6 {

    public static void main(String[] args) {
        WordCounter w = new WordCounter();
        w.accept();
    }
}