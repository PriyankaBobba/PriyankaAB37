/* 73.WAP for below (You can take your name ) String = "My Name Is Priyanka" Output : M N I P.  
After printing this remove all the spaces from the output and print it */

package assignments;

public class RemoveSpaces_Asgmt73 
{

	public static void main(String[] args) 
	{
		String m1 = "My Name Is Priyanka";
		System.out.println(m1.replaceAll("[a-z]",""));
		String m2 = m1.replaceAll("\\s", "");
		//System.out.println(m2);
		System.out.println(m2.replaceAll("[a-z]",""));

	}

}
