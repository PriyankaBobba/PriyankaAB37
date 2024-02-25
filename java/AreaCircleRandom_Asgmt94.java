/*94. Find out the area of a circle for ten times,take pi value from math.pi 
 and take r value from math.random and solve this problem 10 times. */ 
package assignments;

public class AreaCircleRandom_Asgmt94 
{
	public static void main(String[] args) 
	{
		double pi = Math.PI;
		double area;
		for (int i=0; i<10; i++ )
		{
			double radius = Math.random();
			area = pi*radius*radius;
			System.out.println(area);
		}
		

	}

}
