/* 37. WAP to do addition, subtraction,multiplication, division by using scanner class and 
  a and b as global variables*/
package assignments;
import java.util.Scanner;
public class Scannerarthametic_Asgmt37 
{
	static int a,b;
	static float c;
	static void add() 
	 {
		 c= a+b;
		 System.out.println("Addition value is"+ c); 
	 }
	 static void sub() 
	 {
		 c= a-b;
		 System.out.println("Subtraction value is"+ c); 
	 }
	 static void mul() 
	 {
		 c= a*b;
		 System.out.println("Multiplication value is"+ c);
	 }
	 static void div() 
	 {
		 c= a/b;
		 System.out.println("Division value is"+ c);
	 }
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		a = s1.nextInt();
		System.out.println("Enter value of b");
		b = s1.nextInt();
		add();
		sub();
		mul();
		div();
	}
}
