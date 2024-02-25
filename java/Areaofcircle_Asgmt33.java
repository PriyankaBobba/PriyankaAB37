/*33. WAP to find the Area of Circle , keep pi as static global final , 
create 2 methods 1 having r = 7 and another having r =14*/

package assignments;

public class Areaofcircle_Asgmt33 
{
	final static double pi=3.14;
	
	static void areaofcircle()
	{
		int r=14;
		double area = pi*r*r;
		System.out.println(area);
	}
	static void areaofcircle1()
	{
		int r=7;
		double area = pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		areaofcircle();
		areaofcircle1();	
	}

}
