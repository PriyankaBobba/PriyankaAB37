/* 75.Create an array of length 4 of int data type. 
Find out 41 is present or not in array. 
Print message in both the cases.*/
 
package assignments;

public class Array5_Asgmt75 
{
	public static void main(String[] args) 
	{
		int num[] = {78,94,41,26};
		int numtocheck = 41;
		for (int i=0; i<4;i++)
		{
			if(numtocheck == num[i])
			{
				System.out.println("number is present");
			}
			else
			{
				System.out.println("number is not present");
			}
		}
		

	}

}
