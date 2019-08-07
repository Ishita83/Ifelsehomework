import java.util.Scanner;
public class SymbolProgram {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = scanner.nextInt();
        System.out.println("Enter second Number");
        int b = scanner.nextInt();
        System.out.println("Choose Symbol from +,-,/,*");
        String symbol = scanner.next();

        if (symbol.equals("+")) {
            System.out.println(a+b);
        }
        else if (symbol.equals("-")) {
            System.out.println(a-b);
        }
        else if (symbol.equals("*")) {
            System.out.println(a*b);
        }
        else if (symbol.equals("/")) {
            System.out.println(a/b);
        }
        else {

        }

    }
}




















