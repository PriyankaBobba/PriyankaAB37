//106.WAP for return keyword for int and double
package assignments;

public class Return_Asgmt106 
{
	int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	double sub (int a, double b)
	{
		double sub=a-b;
		return sub;
	}
	public static void main(String[] args) 
	{
		Return_Asgmt106 r1 = new Return_Asgmt106();
		System.out.println(r1.add(10, 20));
		System.out.println(r1.sub(40, 20));
	}

}
