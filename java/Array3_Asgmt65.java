/* 65.Create an array of length 4 & copy its value to another array using iteration */
package assignments;

import java.util.Arrays;

public class Array3_Asgmt65 
{
	public static void main(String[] args) 
	{
		String name[]= new String[4];
		name[0] = "Sathvik";
		name[1] = "Bittu";
		name[2] = "Priya";
		name[3] = "Balu";
		
		String name1[] = new String[4];
		for(int i=0; i<4; i++)
		{
			name1[i]=name[i];
		}
		System.out.println("Original array is " +Arrays.toString(name));
		System.out.println("Copied array is "+ Arrays.toString(name1));
	}

}
