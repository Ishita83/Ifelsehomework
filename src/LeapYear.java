import java.util.Scanner;
// Leap year program
public class LeapYear {

  public static void main (String args[]) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a year");
      int a = scanner.nextInt();

      if (((a % 4 == 0) && (a % 100!= 0)) || (a %400 == 0))
          System.out.println(" year is a leap year");
      else
          System.out.println(" year is not a leap year");



  }


  }









