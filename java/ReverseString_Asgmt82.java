/* 82.Reverse a String and Print it */
package assignments;

public class ReverseString_Asgmt82 
{

	public static void main(String[] args) 
	{
		String input ="Sathvik";
		String output = "";
		for(int i=input.length()-1; i>=0; i--)
		{
			char reverse = input.charAt(i);
			System.out.println(reverse);
			output = output+reverse;	
		}
		System.out.println(output);
	}
}
