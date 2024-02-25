/* 21.WAP with 3 methods main,static add and static subtract. Declare and initialize a and b global variables 
as non- static in nature and then perform addition and subtraction with static methods  */

package assignments;

public class GlobalVar1_Asgmt21 
{
	int a=400;
	int b=300;
	static void add()
	{
		GlobalVar1_Asgmt21 g1 = new GlobalVar1_Asgmt21();
		System.out.println(g1.a+g1.b);
	}
	static void sub()
	{
		GlobalVar1_Asgmt21 g1 = new GlobalVar1_Asgmt21();
		System.out.println(g1.a-g1.b);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		
	}

}
