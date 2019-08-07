import java.util.Scanner;

public class PassFailDetails {
    public static void main(String args []){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scanner.next ();
        System.out.println("Enter Roll Number");
        int roll = scanner.nextInt();
        System.out.println("Enter hindi marks");
        double hm = scanner.nextDouble();
        System.out.println("Enter sanskrit marks");
        double sm = scanner.nextDouble();
        System.out.println("Enter english marks");
        double em = scanner.nextDouble();

        if((hm>=35) && (sm>=35)&& (em>=35))
             {System.out.println("PASS");}
        else{System.out.println("FAIL");}





    }
}
