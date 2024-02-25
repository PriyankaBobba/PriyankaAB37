/* 66.Create an array of length 4 of int data type and find out average of those numbers 
 and remainder of those*/
 
package assignments;

public class Array4_Asgmt66 
{

	public static void main(String[] args) 
	{
		int num[] = new int[4];
		num[0] = 6;
		num[1] = 8;
		num[2] = 10;
		num[3] = 16;
		int sum = 0;
		for(int i=0; i<num.length; i++)
		{
			sum = sum+num[i];
		}
			System.out.println(sum);
			double average =sum/num.length;
			System.out.println("Average of numbers is " +average);
			double remainder = sum % num.length;
			System.out.println("Remainder of numbers is " +remainder);

	}

}
