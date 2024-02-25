package assignments;

public class Arithmatic_Operators 
{
	static void add()
	{
		int a=10;
		int b= 20;
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=10;
		int b= 20;
		int sub = a-b;
		System.out.println(sub);	
	}
	void mul()
	{
		int a=10;
		int b= 20;
		int mul = a*b;
		System.out.println(mul);	
	}
	void div()
	{
		float a=10;
		float b= 20;
		float div = a/b;
		System.out.println(div);	
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		Arithmatic_Operators a1 = new Arithmatic_Operators();
		a1.mul();
		a1.div();
	}

}
