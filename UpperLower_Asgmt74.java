/* 74.String = GroTechMinds Output 1= All capital letters in String a.
Output 2= All small letters in String b and print both the strings*/

package assignments;

public class UpperLower_Asgmt74 
{

	public static void main(String[] args) 
	{
		String s1 = "GroTechMinds";
		String a = s1.replaceAll("[a-z]", "");
		System.out.println("String a : "+ a);
		String b = s1.replaceAll("[A-Z]", "");
		System.out.println("String b : "+ b);
		

	}

}
