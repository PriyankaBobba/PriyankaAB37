/*92. Upcasting and downcasting Problem 4 as per Diagram during Class */
package assignments;
class Cricket
{
	void runs()
	{
		System.out.println("Cricket");
	}
}
class Soccer extends Cricket
{
	void goal()
	{
		System.out.println("Soccer");
	}
}
class FootBall extends Soccer
{
	void kick()
	{
		System.out.println("FootBall");
	}
}
public class ClassTypeCasting2_Asgmt92 extends FootBall
{
	void bowling()
	{
		System.out.println("Bowling");
	}
	public static void main(String[] args) 
	{
		 Soccer s1 = new FootBall();
		 s1.goal();
		 s1.runs();
		 FootBall f1 = (FootBall)s1;
		 f1.goal();
		 f1.kick();
		 f1.runs();
	}

}
