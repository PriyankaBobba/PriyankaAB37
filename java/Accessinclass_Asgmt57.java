/* 57.Create a class with 4 different methods other than main method with 4 different 
 access specifiers and try to access them within class */
 
package assignments;

public class Accessinclass_Asgmt57 
{
	public void add()
	{
		System.out.println("public");
	}
	private void sub()
	{
		System.out.println("private");
	}
	protected void mul()
	{
		System.out.println("protected");
	}
	void div()
	{
		System.out.println("default");
	}
	
	public static void main(String[] args) 
	{
		Accessinclass_Asgmt57 a1 = new Accessinclass_Asgmt57();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}
}
