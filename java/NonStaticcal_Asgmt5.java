//5.Write a non static method and call it inside the main method
package assignments;
public class NonStaticcal_Asgmt5 
{
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		NonStaticcal_Asgmt5 n = new NonStaticcal_Asgmt5();
		n.add();

	}

}
