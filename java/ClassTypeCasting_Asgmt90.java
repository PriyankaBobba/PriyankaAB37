/* 90.Upcasting and downcasting Problem 2 as per Diagram during Class*/
package assignments;
class OneAdd
{
	void add()
	{
		System.out.println("add");
	}
}
class TwoSub extends OneAdd
{
	void sub()
	{
		System.out.println("sub");
	}
}
public class ClassTypeCasting_Asgmt90 extends TwoSub
{
	void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args) 
	{
		OneAdd o1 = new ClassTypeCasting_Asgmt90();//upcasting
		o1.add();
		ClassTypeCasting_Asgmt90 c =(ClassTypeCasting_Asgmt90)o1;//downcasting
		c.add();
		c.mul();
		c.sub();
	}

}
