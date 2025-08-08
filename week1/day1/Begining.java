package week1.day1;
import java.util.Scanner;
public class Begining {
public static void main(String[] args) {
	System.out.println("Hello Testleaf");
	Scanner scan=new Scanner(System.in);
	int a = scan.nextInt ();
	int b =scan.nextInt();
	
	int c=a+b,d=a-b,e=a*b,f=a/b,g=a%b;


	
	System.out.println("Addition = "+ c);
	System.out.println("Subraction = "+ d);
	System.out.println("Multiplication = "+ e);
	System.out.println("Division = "+ f);
	System.out.println("Modulo = "+ g);

}
   
}
