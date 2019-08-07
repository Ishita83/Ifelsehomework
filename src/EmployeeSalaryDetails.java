import java.util.Scanner;

public class EmployeeSalaryDetails {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
      System.out.println("Enter employee id");
      int a = scanner.nextInt();
       System.out.println("Enter Name");
       String Name = scanner.next();
       System.out.println("Enter Basic Salary");
       double b = scanner.nextDouble();
       System.out.println("HRA ="+b*0.10);
        System.out.println("DA ="+b*0.08);
        System.out.println("TA ="+b*0.09);
        System.out.println("PF ="+b*0.20);

        System.out.println("Gross Salary = "+ (b +(b*0.10)+(b*0.08)+(b*0.09)-(b*0.20)));







    }




}
