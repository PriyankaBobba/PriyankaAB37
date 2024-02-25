/* 20.WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables 
and initialize then in each method and perform addition and subtraction*/
package assignments;

public class GlobalVar_Asgmt20 
{
	static int a;
	static int b;
	
	static void add()
	{
		a= 200;
		b= 100;
		System.out.println(a+b);
	}
	static void sub()
	{
		a= 200;
		b= 100;
		System.out.println(a-b);
		
	}
	public static void main(String[] args) 
	{
		add();
		sub();
	}

}
