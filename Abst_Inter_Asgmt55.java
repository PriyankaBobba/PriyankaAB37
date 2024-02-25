/*55.Create child class having relation with abstract class and abstract class 
having relation with interface(1st) & that interface(1st) having relation with 
another interface(2nd) */
package assignments;
interface DC
{
	void bluebeetle();
}
interface Marvel extends DC
{
	void spiderman();
}
abstract class Superheros implements Marvel
{
	abstract void ironmnan();
}
public class Abst_Inter_Asgmt55 extends Superheros
{

	public static void main(String[] args) 
	{
		Abst_Inter_Asgmt55 a1 = new Abst_Inter_Asgmt55();
		a1.bluebeetle();
		a1.ironmnan();
		a1.spiderman();
	}
	public void spiderman() 
	{
		System.out.println("Spiderman");
	}
	public void bluebeetle() 
	{
		System.out.println("Bluebeetle");
	}
	void ironmnan() 
	{	
		System.out.println("Ironmnan");
	}
}
