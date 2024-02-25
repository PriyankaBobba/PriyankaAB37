//104.WAP on LinkedHashSet
package assignments;
import java.util.LinkedHashSet;
public class LinkedHashSet_Asgmt104 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l1 = new LinkedHashSet(); 
		l1.add("Sita");
		l1.add(26);
		l1.add('F');
		l1.add(5.5);
		l1.add(null);
		l1.add(true);
		l1.add("Rama");
		l1.add(26);
		l1.add('M');
		l1.add(5.5);
		l1.add(null);
		l1.add(false);
		l1.add("Sita");
		l1.add(49);
		l1.add('F');
		l1.add(9.5);
		l1.add(null);
		l1.add(true);
		l1.add("Hanuman");
		l1.add(26);
		l1.add('F');
		l1.add(8.5);
		l1.add(null);
		l1.add(true);
		l1.add(true);
		System.out.println(l1);
		LinkedHashSet l2 = new LinkedHashSet();
		l2.add(30);
		l2.add(10);
		l2.add(48);
		l2.add(6);
		//Collections.sort(h2);
		//System.out.println(h2);	
	}
}
