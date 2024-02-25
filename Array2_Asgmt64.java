/* 64.Create an array of length 3 having String datatype and print it without sorting. 
 Now Sort the array and print its value after sorting.Use to String function to print the array*/
package assignments;

import java.util.Arrays;

public class Array2_Asgmt64 
{

	public static void main(String[] args) 
	{
		String name[]= new String[3];
		name[0]="Sathvik";
		name[1]= "Balu";
		name[2]="Priya";
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));

		
	}

}
