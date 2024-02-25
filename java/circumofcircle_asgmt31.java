//31. WAP to find the circumference of a circle .(pi should be final static global).
package assignments;

public class circumofcircle_asgmt31 
{
	final static double pi=3.14;
	static void circumferanceofcircle()
	{
		int r=14;
		double circumferance = 2*pi*r;
		System.out.println(circumferance);	
	}
	public static void main(String[] args) 
	{
		circumferanceofcircle();
	}

}
