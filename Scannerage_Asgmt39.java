/*39. WAP by taking value of age from scanner class and if age is greater than equal 
to 18 then print " I am adult" else print " I am young"*/
package assignments;

import java.util.Scanner;

public class Scannerage_Asgmt39 {
	

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter age");
		int age = s1.nextInt();
		if(age>=18) 
		{
			System.out.println("I am adult");
		}
		else
		{
			System.out.println("I am young");
		}
	}

}
