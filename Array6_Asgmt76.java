/*76.Create an array of length 5. Find out the index of number 41*/

package assignments;

public class Array6_Asgmt76 
{

	public static void main(String[] args) 
	{
		int num [] = {12,14,41,56,89};
		int n= 41;
		for(int i=0; i<num.length;i++)
		{
			if(n==num[i])
			{
				System.out.println("The index of number is:" + i);
			}
		}
		

	}

}
