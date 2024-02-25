/* 60.WAP to access 4 different access specifiers outside the package by becoming the subclass */
package assignments;

import basics.Accessoutpack1b_Asgmt60;

public class Accessoutpack1a_Asgmt60 extends Accessoutpack1b_Asgmt60
{
	public static void main(String[] args) 
	{
		Accessoutpack1a_Asgmt60 a1 = new Accessoutpack1a_Asgmt60();
		a1.add();
		a1.mul();
	}

}
