/*93. Upcasting and downcasting Problem 5 as per Diagram during Class */
package assignments;
class Macys
{
	void perfumes()
	{
		System.out.println("Macys");
	}
}
class Dillards extends Macys
{
	void handbags()
	{
		System.out.println("Dillards");
	}
}
class Nordstrom extends Dillards
{
	void clothing()
	{
		System.out.println("Nordstrom");
	}
}
public class ClassTypeCasting3_Asgmt93 extends Nordstrom
{
	void watches()
	{
		System.out.println("Watches");
	}
	public static void main(String[] args) 
	{
		Dillards d1 = new Nordstrom();
		d1.handbags();
		d1.perfumes();
		Nordstrom n1 = new ClassTypeCasting3_Asgmt93();
		n1.clothing();
		n1.handbags();
		n1.perfumes();
		ClassTypeCasting3_Asgmt93 c1 = (ClassTypeCasting3_Asgmt93)n1;
		c1.clothing();
		c1.handbags();
		c1.perfumes();
		c1.watches();
	}

}
