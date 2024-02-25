/* 53.Do everything same as Assignment 52 but only with 4 interfaces instead of 2*/
package assignments;
interface Animals
{
	void rabbit();
}
interface Wildanimal
{
	void tiger();
}
interface Birds
{
	void parrots();
}
interface Seaanimals
{
	void sharks();
}
public class Interface3_Asgmt53 implements Animals,Wildanimal, Birds, Seaanimals
{
	public static void main(String[] args) 
	{
		Interface3_Asgmt53 i1 = new Interface3_Asgmt53();
		i1.sharks();
		i1.parrots();
		i1.tiger();
		i1.rabbit();
	}
	public void sharks() 
	{
		System.out.println("Sharks");	
	}
	public void parrots() 
	{
		System.out.println("Parrots");	
	}
	public void tiger() 
	{
		System.out.println("Tiger");
	}
	public void rabbit() 
	{
		System.out.println("Rabbit");
	}
}
