/*63.Create an array of length =5 of int datatype and fetch its value from scanner class.*/

package assignments;

import java.util.Scanner;

public class Array1_Asgmt63 
{

	public static void main(String[] args) 
	{
		int num[] = new int[5];
		for(int i=0; i<=4; i++)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the value of index"+i);
			num[i] = s1.nextInt();
		}

	}

}
