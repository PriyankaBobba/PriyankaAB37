/* 10.WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. 
Multiply and divide in last two and call in main method.*/
package assignments;

public class Arithmetic_asgmt10 
{
	static void add()
	{
		int a= 60;
		int b=20;
		int c= a+b;
		System.out.println(c);
		
	}
	static void sub()
	{
		int a= 60;
		int b=20;
		int c= a-b;
		System.out.println(c);
	}
	void mul()
	{
		int a= 60;
		int b=20;
		int c= a*b;
		System.out.println(c);
	}
	void div()
	{
		int a= 60;
		int b=20;
		int c= a/b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		Arithmetic_asgmt10 a = new Arithmetic_asgmt10();
		a.mul();
		a.div();	
	}
}
