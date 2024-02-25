/* 51.Create 1 child class having main method ,1 abstract class having 1 abstract 
 method and 1 concrete method and interface having abstract method and create 
 relation between child class->Abstract class->Interface */
 
package assignments;

interface Yoga 
{
	void meditation();	
}
abstract class GYM  
{
	abstract void threadmill();
	static void apple()
	{
		System.out.println("Apple");
	}
}
public class Abst_Inter_Asgmt51 extends GYM implements Yoga
{
	public static void main(String[] args) 
	{	
		Abst_Inter_Asgmt51 a1 = new Abst_Inter_Asgmt51();
		a1.meditation();
		a1.threadmill();
		apple();
	}
	public void meditation() 
	{	
		System.out.println("meditation");
	}
	void threadmill() 
	{
		System.out.println("threadmill");	
	}

}
