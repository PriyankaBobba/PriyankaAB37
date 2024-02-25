/* 43.WAP for single level inheritance in a single program and make all methods 
 non static(selenium,java,gk) by creating object in child class  */

package assignments;
class Teacher
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

public class SingleInher_Asgmt43 extends Teacher
{
	
	 void gk()
	{
		System.out.println("General Knowledge");
	}
	public static void main(String[] args) 
	{
		SingleInher_Asgmt43 s1 = new SingleInher_Asgmt43();
		s1.selenium();
		s1.java();
		s1.gk();
	}

}
