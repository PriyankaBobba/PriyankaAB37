//100.WAP on Vector
package assignments;

import java.util.Collections;
import java.util.Vector;

public class ColVector_Asgmt100 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add("Sita");
		v1.add(26);
		v1.add('F');
		v1.add(5.5);
		v1.add(null);
		v1.add(true);
		v1.add("Rama");
		v1.add(26);
		v1.add('M');
		v1.add(5.5);
		v1.add(null);
		v1.add(false);
		v1.add("Sita");
		v1.add(49);
		v1.add('F');
		v1.add(9.5);
		v1.add(null);
		v1.add(true);
		v1.add("Hanuman");
		v1.add(26);
		v1.add('F');
		v1.add(8.5);
		v1.add(null);
		v1.add(true);
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add(30);
		v2.add(10);
		v2.add(48);
		v2.add(6);
		Collections.sort(v2);
		System.out.println(v2);		
		

	}

}
