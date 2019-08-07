import java.util.Scanner;

public class AverageNum {
   public static void main(String args[]){

       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first number");
       int a = scanner.nextInt();
       System.out.println("Enter second number");
       int b = scanner.nextInt();
       System.out.println("Enter third number");
       int c = scanner.nextInt();
       System.out.println("Enter fourth number");
       int d = scanner.nextInt();
       System.out.println("Enter fifth number");
       int e = scanner.nextInt();
       System.out.println("Average ="+ (+a+b+c+d+e)/5);



   }



}
