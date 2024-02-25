/* 69."M1="Mom"; M2="Dad"; Output should print as MDoamd" */

package assignments;

public class AlterString_Asgmt69 
{

	public static void main(String[] args) 
	{
		String M1= "Mom";
		String M2= "Dad";
		String result=" ";
		for(int i=0;i < M1.length()||i < M2.length();i++)
		{
			if(i<M1.length())
				result= result+M1.charAt(i);
			if(i<M2.length())
				result= result+M2.charAt(i);
		}
		System.out.println(result);

	}

}
