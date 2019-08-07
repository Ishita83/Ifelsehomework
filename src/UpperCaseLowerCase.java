import java.util.Scanner;

public class UpperCaseLowerCase {

   public static void main (String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Capital Alphabet");
       char a = scanner.next().charAt(0);

            int i;
            i = (int)a;
            i = i+32;
       a = (char)i;
       System.out.println(a);

   }
}
