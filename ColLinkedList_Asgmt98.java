//98.WAP on LinkedList
package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ColLinkedList_Asgmt98 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList(); 
		l1.add("Priya");
		l1.add("Bittu");
		l1.add("Balu");
		l1.add("Sathvik");
		l1.add("Bittu");
		l1.add('B');
		l1.add('B');
		l1.add('S');
		l1.add(18);
		l1.add(18);
		l1.add(99.9);
		l1.add(true);
		l1.add(true);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		l2.add(100);
		l2.add(100);
		l2.add(90);
		l2.add(80);
		l2.add(60);
		Collections.sort(l2);
		System.out.println(l2);	

	}

}
