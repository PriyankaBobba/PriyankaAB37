/* 45.WAP for multilevel inheritance in a single program and make all the methods are non static */
package assignments;
class One
{
	void add()
	{
		System.out.println("addition");
	}
}
class Two extends One
{
	void sub()
	{
		System.out.println("subtraction");
	}
}

public class MultiInher_Asgmt45 extends Two
{
	void mul()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) 
	{
		MultiInher_Asgmt45 m1 = new MultiInher_Asgmt45();
		m1.add();
		m1.sub();
		m1.mul();
	}

}
