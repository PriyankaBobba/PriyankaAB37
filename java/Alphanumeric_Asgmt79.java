/* 79. Take any alphanumeric String and find out which are numeric values and 
 characters and print it */
 
package assignments;

public class Alphanumeric_Asgmt79 
{
	public static void main(String[] args) 
	{
		String name = "sathvik123";
		String s1 = name.replaceAll("[a-z]", "");
		System.out.println("numeric values of a String : " +s1);
		String s2 = name.replaceAll("[0-9]", "");
		System.out.println("characters of a String : " +s2);

	}

}
