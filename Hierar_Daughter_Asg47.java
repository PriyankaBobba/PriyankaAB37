/*47.write a program for hierarchical inheritance and create three separate classes(son, daughter, parent) */
package assignments;

public class Hierar_Daughter_Asg47 extends Hierar_Parent_Asg47
{
	 void sub()
	 {
		 System.out.println("Subtraction");
	 }	

	public static void main(String[] args)
	{
		Hierar_Daughter_Asg47 h1 = new Hierar_Daughter_Asg47();
		h1.mul();
		h1.sub();

	}

}
