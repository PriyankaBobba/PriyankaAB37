/*56.Create child class having relation with interface(1st) 1st interface having relation 
with 2nd interface 2nd interface having relation with 3rd interface */
package assignments;

interface Ohio
{
	void cincinnati();
}
interface California extends Ohio 
{
	void sanfrancisco();
}
interface Indiana extends California
{
	void indianapolis();
}
public class Interface_Asgmt56 implements Indiana
{
	public static void main(String[] args) 
	{
		Interface_Asgmt56 i1 = new Interface_Asgmt56();
		i1.cincinnati();
		i1.indianapolis();
		i1.sanfrancisco();
	}
	public void sanfrancisco() 
	{
		System.out.println("Sanfrancisco");
	}

	public void cincinnati() 
	{
		System.out.println("cincinnati");
	}
	public void indianapolis() 
	{
		System.out.println("indianapolis");	
	}
}
