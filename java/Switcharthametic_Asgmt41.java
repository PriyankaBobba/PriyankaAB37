 /* 41."WAP a program using  Switch(a) keyword case1:addition,case2:subtraction,
case3:multiplication,case4 And fetch the value of 'a' with scanner
class using next int() method." */ 

package assignments;
import java.util.Scanner;
public class Switcharthametic_Asgmt41 
{
	public static void main(String[] args) 
	{
		int b =10, c=20;
		float d;
		Scanner s1 = new Scanner(System.in);
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
