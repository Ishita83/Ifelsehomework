import java.util.Scanner;
public class RecognizeValue {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your desire value");
        char a = scanner.next().charAt(0);
        int i;
        i = (int) a;
        if (i >= 48 && i <= 57) {
            System.out.println("Numeric");
        } else if ((i >= 97 && i <= 122) || (i >= 65 && i <= 90)) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Symbol");
        }
    }
}