/* 70. M1="My Name is Manish" Output should print in reverse order as hsinaM si emaN yM " */

package assignments;

public class ReverseString_Asgmt70 
{

	public static void main(String[] args) 
	{
		String M1 = "My Name is Manish";
		String M2 = M1.toLowerCase();
		for(int i= M2.length()-1;i>=0;i--)
		{
			System.out.print(M2.charAt(i));
		}

	}

}
