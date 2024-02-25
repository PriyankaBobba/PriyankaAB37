/* 42.WAP using switch(a) keyword case1: addition of b&c, case2: subtraction of b&c, 
 case3: multiplication of b&C, case4: division of b&c. Fetch the value of a, b &c 
 from scanner class using nextint() method. And print the output individually for all cases.*/  
package assignments;
import java.util.Scanner;
public class Switchscanner_Asgmt42 
{
	public static void main(String[] args) 
	{
		float d;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		System.out.println("Enter the value of c");
		int c = s1.nextInt();
		System.out.println("Enter the case number");
		int a = s1.nextInt();
		switch(a)
		{
		case 1:d = b+c;
		   System.out.println("Addition of two numbers is" +d);
		   break;
		case 2:d = b-c;
		   System.out.println("Subtraction of two numbers is" +d);
		   break;
		case 3:d = b*c;
		   System.out.println("Multiplication of two numbers is" +d);
		   break;
		case 4:d = b/c;
		   System.out.println("Division of two numbers is " +d);
		   break;
	}

	}
}
