/*47.write a program for hierarchical inheritance and create three separate classes(son, daughter, parent) */
package assignments;

public class Hierar_Son_Asg47 extends Hierar_Parent_Asg47
{
	void add()
	 {
		 System.out.println("Addition");
	 }
	public static void main(String[] args) 
	{
		Hierar_Son_Asg47 h47 = new Hierar_Son_Asg47();
		h47.add();
		h47.mul();
	}
	

}
