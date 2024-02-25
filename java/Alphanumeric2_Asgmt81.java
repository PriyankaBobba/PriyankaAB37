/* 81.Find out number of char and number of digits in below string Rahul123 */

package assignments;

public class Alphanumeric2_Asgmt81 
{

	public static void main(String[] args) 
	{
		String name = "Rahul123";
		char c1[] = name.toCharArray();
		for(int i=0; i< name.length(); i++)
		{
			boolean answer = Character.isDigit(c1[i]);
			if(answer==true)
			{
				System.out.println(c1[i]+ " is a digit " +answer);
			}
			else
			{
				System.out.println(c1[i]+ " is a Char "+answer);
			}
			
		}

	}

}
