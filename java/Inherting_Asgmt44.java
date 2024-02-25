/* 44.WAP for single level inheritance where gk method(child) is static 
 and parent(selenium and java) are non static.*/ 
package assignments;

class Teacher1
{
	void selenium()
	{
		System.out.println("Selenium");
	}
	void java()
	{
		System.out.println("Java");
	}
}
public class Inherting_Asgmt44 extends Teacher1 
{

	static void gk()
	{
		System.out.println("General Knowledge");
	}

	public static void main(String[] args) 
	{
		Inherting_Asgmt44 i1 = new Inherting_Asgmt44();
		i1.java();
		i1.selenium();
		gk();
	}

}
