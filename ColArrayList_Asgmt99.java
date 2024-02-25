//99.WAP on ArrayList
package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ColArrayList_Asgmt99 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Priya");
		a1.add("Bittu");
		a1.add("Balu");
		a1.add("Sathvik");
		a1.add("Bittu");
		a1.add('B');
		a1.add('B');
		a1.add('S');
		a1.add(18);
		a1.add(18);
		a1.add(99.9);
		a1.add(true);
		a1.add(true);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(100);
		a2.add(100);
		a2.add(90);
		a2.add(80);
		a2.add(60);
		Collections.sort(a2);
		System.out.println(a2);	
	}

}
