/* 46. write a program for hierarchical inheritance and create a three classes
 (son, daughter, parent) in a single program */
package assignments;
 class Parent
{
	 void add()
	 {
		 System.out.println("Addition");
	 }	
}
 class Son extends Parent
{
	 void sub()
	 {
		 System.out.println("Subtraction");
	 }	
}

public class Hierar_Asgmt46 extends Parent
{
	void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		Hierar_Asgmt46 h1 = new Hierar_Asgmt46();
		h1.add();
		h1.mul();
		
	}

}
