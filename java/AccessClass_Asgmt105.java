/*105.WAP for Access Specifier for Class - Create 2 packages package 1 having 2 classes 
one public having main and one default , package 2 having 2 classes one public and one 
default with both have no main method*/
package assignments;

import arrays.AccessClassMul_Asgmt105;

public class AccessClass_Asgmt105 
{
	public static void sub()
	{
		System.out.println("Subtraction");
	}

	public static void main(String[] args) 
	{
		AccessClass_Asgmt105 a2 = new AccessClass_Asgmt105();
		sub();
		
	    AccessClassAdd_Asgmt105 a1 = new AccessClassAdd_Asgmt105();
	    a1.add();
	    
	    AccessClassMul_Asgmt105 a3 =new AccessClassMul_Asgmt105();
	    a3.mul();
	}

}
