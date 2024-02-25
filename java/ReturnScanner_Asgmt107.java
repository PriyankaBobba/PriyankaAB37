//107.WAP for return keyword for float , double , string , boolean , using scanner class
package assignments;

import java.util.Scanner;

public class ReturnScanner_Asgmt107 
{
	float add(float a, float b)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s1.nextFloat();
		System.out.println("Enter the value of b");
		b=s1.nextFloat();
		float sum= a+b;
		return sum;
	}
	double sub(double a, double b)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s1.nextDouble();
		System.out.println("Enter the value of b");
		b=s1.nextDouble();
		double diff =a-b;
		return diff;
	}
	String name(String firstname, String lastname)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Firstname");
		firstname = s1.next();
		System.out.println("Enter the value of Lastname");
		lastname = s1.next();
		String join = firstname.concat(" ").concat(lastname);
		return join;	
	}
	boolean bee(boolean a, boolean b)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s1.nextBoolean();
		System.out.println("Enter the value of b");
		b=s1.nextBoolean();
		boolean d=a||b;
		return d;
	}
	public static void main(String[] args) 
	{
		ReturnScanner_Asgmt107 r1 = new ReturnScanner_Asgmt107();
		System.out.println("Sum of a+b is " +r1.add(0, 0));
		System.out.println("Diff of a-b is" +r1.sub(0, 0));
		System.out.println("Joined String is " + r1.name(null, null));
		System.out.println("Boolean is " + r1.bee(false, false));	
	}

}
