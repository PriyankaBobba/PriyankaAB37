//38. WAP to find area of triangle by taking values of a and b from scanner class
package assignments;

import java.util.Scanner;

public class Scannerarea_Asgmt38 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Values of b");
		int b = s1.nextInt(); 
		System.out.println("Enter Values of h");
		int h = s1.nextInt();
		float area=(b*h)/2;
		System.out.println(area);


	}

}
