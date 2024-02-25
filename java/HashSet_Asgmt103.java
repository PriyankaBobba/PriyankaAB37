//103.WAP on HashSet
package assignments;

import java.util.Collections;
import java.util.HashSet;
public class HashSet_Asgmt103 
{
	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add("Sita");
		h1.add(26);
		h1.add('F');
		h1.add(5.5);
		h1.add(null);
		h1.add(true);
		h1.add("Rama");
		h1.add(26);
		h1.add('M');
		h1.add(5.5);
		h1.add(null);
		h1.add(false);
		h1.add("Sita");
		h1.add(49);
		h1.add('F');
		h1.add(9.5);
		h1.add(null);
		h1.add(true);
		h1.add("Hanuman");
		h1.add(26);
		h1.add('F');
		h1.add(8.5);
		h1.add(null);
		h1.add(true);
		h1.add(true);
		System.out.println(h1);
		
		HashSet h2 = new HashSet();
		h2.add(30);
		h2.add(10);
		h2.add(48);
		h2.add(6);
		//Collections.sort(h2);
		//System.out.println(h2);	
	}

}
