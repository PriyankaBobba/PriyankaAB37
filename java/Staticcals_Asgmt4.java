//4.Create many static methods and call in inside a main method
package assignments;
public class Staticcals_Asgmt4 
{
	static void add()
	{
		int a= 10;
		int b= 20;
		System.out.println(a+b);
	}
	static void sub()
	{
		int a= 10;
		int b= 20;
		System.out.println(b-a);
	}
	static void mul()
	{
		int a= 10;
		int b= 20;
		System.out.println(a*b);
	}
	static void div()
	{
		int a= 10;
		int b= 20;
		System.out.println(b/a);
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}
}
