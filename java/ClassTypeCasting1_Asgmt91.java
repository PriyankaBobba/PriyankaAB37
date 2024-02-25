/* 91.Upcasting and downcasting Problem 3 as per Diagram during Class*/
package assignments;
class GrandParent
{
  void gparent()
  {
	  System.out.println("GrandParent");
  }
}
class ParentP extends GrandParent
{
	void parent1()
	{
		System.out.println("Parent");
	}
}
public class ClassTypeCasting1_Asgmt91 extends ParentP
{
	void child()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) 
	{
		ParentP p1 = new ClassTypeCasting1_Asgmt91();
		p1.gparent();
		p1.parent1();
		ClassTypeCasting1_Asgmt91 c1 = (ClassTypeCasting1_Asgmt91)p1;
		c1.gparent();
		c1.parent1();
		c1.child();	
	}

}
