//8.Create few constructor and call it in main method
package assignments;

public class Construcors_Asgmt8 
{
	Construcors_Asgmt8()
	{
		int a=30;
		int b=40;
		System.out.println(a+b);
	}
	Construcors_Asgmt8(int c, int d)
	{
		System.out.println(c*d);
	}
	Construcors_Asgmt8(float e, int f)
	{
		System.out.println(e-f);
	}

	public static void main(String[] args) 
	{
		new Construcors_Asgmt8();
		new Construcors_Asgmt8(2,9);
		new Construcors_Asgmt8(10.9f , 8);

	}

}
