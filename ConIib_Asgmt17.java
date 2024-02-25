//17.WAP with 4 constructors and 1 IIB
package assignments;

public class ConIib_Asgmt17 
{
	ConIib_Asgmt17()
	{
		System.out.println("Construcor1");
	}
	ConIib_Asgmt17(int a)
	{
		System.out.println("Construcor2");
	}
	ConIib_Asgmt17(double a)
	{
		System.out.println("Construcor3");
	}
	ConIib_Asgmt17(String a)
	{
		System.out.println("Construcor4");
	}

	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		new ConIib_Asgmt17();
		new ConIib_Asgmt17(10);
		new ConIib_Asgmt17('p');
		new ConIib_Asgmt17("Priya");
	}
}
