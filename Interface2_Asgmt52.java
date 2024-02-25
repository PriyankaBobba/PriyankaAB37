/* 52.Create child class and 2 interfaces and create relation of child class with 
 interface(1st) and relation of child class with interface(2nd) and achieve 
 multiple level inheritance*/ 
package assignments;
interface State_Tax
{
	void state_ittax();
	void state_gsttax();	
}
interface Country_Tax
{
	void country_ittax();
	void country_gstta();
}
public class Interface2_Asgmt52 implements State_Tax, Country_Tax
{
	public static void main(String[] args) 
	{
		Interface2_Asgmt52 i1 = new Interface2_Asgmt52();
		i1.country_gstta();
		i1.country_ittax();
		i1.state_ittax();
		i1.state_gsttax();
	}
    public void country_ittax() 
	{
		System.out.println("country_ittax");	
	}
	public void country_gstta() 
	{
		System.out.println("country_gstta");	
	}
	public void state_ittax() 
	{
		System.out.println("state_ittax");
	}
	public void state_gsttax() 
	{
		System.out.println("state_gsttax");
	}
}
