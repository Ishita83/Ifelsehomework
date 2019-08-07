import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class StudentDetails {

 public static void main (String args[]){
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
     System.out.println("Total Marks ="+(sm+hm+em)+" And percentage "+((sm+hm+em)/3)+ "%");
      if ( (sm+hm+em)/3>=35 ){System.out.println("Pass");}
      else{System.out.println("Fail");}


     if ( (sm+hm+em)/3>=80 )
     {System.out.println("Grade A+");}
     else if ((sm+hm+em)/3>=60)
     {System.out.println("Grade A");}
     else if ((sm+hm+em)/3>=50)
     {System.out.println("Grade B");}
     else if ((sm+hm+em)/3>=35)
     {System.out.println("Grade C");}
     else{}













 }

























}

