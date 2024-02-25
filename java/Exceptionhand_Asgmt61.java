/* 61.WAP to handle below 2 exceptions by using 2 catch blocks Scanner s1= new Scanner
int c = 1/0; int a = s1.nextint(); */

package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhand_Asgmt61 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter value of a");
			int a = s1.nextInt();
			System.out.println("Enter value of b");
			int b = s1.nextInt();
			int c=a/b;
			System.out.println("the value of c is" + c);	 
		}
		catch(ArithmeticException a1)
		{
			System.out.println("int can't store infinity. Arithmetic Exception");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("int can't store infinity. InputMismatchException Exception");
		}
	}

}
