/*36.WAP to do addition, subtraction,multiplication, division by using scanner class 
and  a and b as local variables*/
package assignments;
import java.util.Scanner;
public class Scannerarthametic_Asgmt36 {
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= s1.nextInt();
		System.out.println("Enter value of b");
		int b= s1.nextInt();
		System.out.println("Addition of two numbers");
		int Sum= a+b;
		System.out.println(Sum);
	}
	static void sub()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= s1.nextInt();
		System.out.println("Enter value of b");
		int b= s1.nextInt();
		System.out.println("Subtraction of two numbers");
		int Sub= a-b;
		System.out.println(Sub);	
	}
	static void mul()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= s1.nextInt();
		System.out.println("Enter value of b");
		int b= s1.nextInt();
		System.out.println("Multiplication of two numbers");
		int Mul= a*b;
		System.out.println(Mul);	
	}
	static void div()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a= s1.nextInt();
		System.out.println("Enter value of b");
		int b= s1.nextInt();
		System.out.println("Division of two numbers");
		int Div= a/b;
		System.out.println(Div);	
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();	
	}
}
