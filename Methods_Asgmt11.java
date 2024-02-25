/* 11.WAP where in a class, there are 5 methods(3static, 2non static) with same name....
 first method argument is int a, second method argument is double a,third method argument is char a, 
 fourth method argument is boolean a and fifth method argument is String a */ 
package assignments;
public class Methods_Asgmt11 
{
	static void name(int a)
	{
		System.out.println("name1");
	}
	static void name(double a)
	{
		System.out.println("name2");
	}
	static void name(char a)
	{
		System.out.println("name3");
	}
	void name (boolean a)
	{
		System.out.println("name4");
	}
	void name(String a)
	{
		System.out.println("name5");
	}
	

	public static void main(String[] args) 
	{
		name(11);
		name(12.22);
		name('p');
		Methods_Asgmt11 m = new Methods_Asgmt11();
		m.name(true);
		m.name("Priya");		
	}
}
