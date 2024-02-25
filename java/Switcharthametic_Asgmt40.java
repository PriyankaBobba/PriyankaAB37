/* 40. WAP a program using Switch(3) keyword case1: addition, case2:subtraction, 
case3:multiplication,case4:division and break at case(3).*/
package assignments;
public class Switcharthametic_Asgmt40 
{
	public static void main(String[] args) 
	{
		int b =10, c=20;
		float d;
		switch(3)
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
