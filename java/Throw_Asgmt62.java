/* 62."WAP by using throw keyword if the age of a person is > 18 then allow him
 to access www.google.com else throw an ArithmeticException"*/
package assignments;

import java.util.Scanner;

public class Throw_Asgmt62 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your age:");
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		if (age>18)
		{
			System.out.println("Visit www.google.com");
		}
		else
		{
			throw new ArithmeticException("ArithmeticException");
		}
	}

}
