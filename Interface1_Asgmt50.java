/*Create 1 child class and 2 interfaces ( both having 2-2 abstract methods in it) and 
  create relation between child class->interface(1st)->interface(2nd)*/
package assignments;
interface Fruits
{
	void apple();
	void mango();		
}
interface Flowers extends Fruits
{
	void rose();
	void lilly();		
}
public class Interface1_Asgmt50 implements Flowers
{
	public static void main(String[] args) 
	{
		Interface1_Asgmt50 i1 = new Interface1_Asgmt50();
		i1.apple();
		i1.mango();
		i1.rose();
		i1.lilly();
	}
	public void apple() 
	{
		System.out.println("Apple");
	}
	public void mango() 
	{
		System.out.println("Mango");	
	}
	public void rose() 
	{
		System.out.println("Rose");
	}
	public void lilly() 
	{
		System.out.println("Lilly");
	}
}
