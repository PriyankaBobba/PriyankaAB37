/*68.M1="Software"; M2="Testing";
Output should print as:SoftwareTesting in a vertical way */

package assignments;

public class VerticalString_Asgmt68 
{
	public static void main(String[] args) 
	{
		String M1 = "Software";
		String M2 = "Testing";
		String M3 = M1.concat(M2);
		//System.out.println(M3);
		for(int i=0;i<=M3.length()-1;i++)
		{
			System.out.println(M3.charAt(i));
		}	

	}

}
