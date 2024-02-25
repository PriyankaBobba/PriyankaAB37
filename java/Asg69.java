/*"write a java Program M1=""Mom"";
M2=""Dad"";
Output should print as MDoamd"*/
package assignments;

public class Asg69 
{
	public static void main(String[] args) 
	{
		String m1="Mom";
		String m2="Dad";
		String result=" ";
		for(int i=0; i<m1.length()||i<m2.length();i++)
		{
			if(i<m1.length())
			{
				result=result+m1.charAt(i);
			}
			if(i<m2.length())
			{
				result=result+m2.charAt(i);
			}
		}
		System.out.println(result);
	}
}
