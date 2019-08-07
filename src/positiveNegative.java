import java.util.Scanner;

public class positiveNegative {
    static public void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        if( a>=1)
        {System.out.println("Positive");}
        else if(a<=-1)
        {System.out.println("Negative");}
        else
        {System.out.println("Zero");}
    } }

