//6.Write many non static method and call it inside the main method
package assignments;
public class NonStaticcals_Asgmt6 
{
	void add()
	{
		int a= 10;
		int b= 20;
		System.out.println(a+b);
	}
	void sub()
	{
		int a= 10;
		int b= 20;
		System.out.println(b-a);
	}
	void mul()
	{
		int a= 10;
		int b= 20;
		System.out.println(a*b);
	}
    void div()
	{
		int a= 10;
		int b= 20;
		System.out.println(b/a);
	}

	public static void main(String[] args) 
	{
		NonStaticcals_Asgmt6 n1 = new NonStaticcals_Asgmt6();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
	}

}
