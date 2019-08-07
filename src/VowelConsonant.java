import java.util.Scanner;

public class VowelConsonant {

public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input any Alphabet");
    char a = scanner.next().charAt(0);
    if (a=='a' ||a=='A' || a=='e' || a=='E'|| a=='i'|| a=='I' ||a=='o' ||a=='O'||a=='u'||a=='U')
    {System.out.println("vowel");}
    else {
        System.out.println("Consonant");

    }

}}