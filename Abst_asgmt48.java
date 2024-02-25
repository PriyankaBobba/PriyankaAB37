/* 48.create a class and create two concrete methods inside a class(static add, non static sub), 
 create abstract class and create two abstract methods (multiplication, division), create two 
 concrete methods inside main method*/ 
package assignments;
class Concrete1
{
	static void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("subtraction");
	}	
}
abstract class AbstMeth extends Concrete1
{
	abstract void mul();
	abstract void div();		
}
public class Abst_asgmt48 extends AbstMeth
{
	static void one()
	{
		System.out.println("one");
	}
	static void two()
	{
		System.out.println("two");
	}
	public static void main(String[] args) 
	{
		Abst_asgmt48 a1 = new Abst_asgmt48();
		a1.div();
		a1.mul();
		a1.sub();
		add();
		one();
		two();
	}	
	void mul() 
	{
		System.out.println("multiplication");	
	}	
	void div() 
	{
		System.out.println("division");	
	}

}
