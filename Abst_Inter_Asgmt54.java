/* 54.Create child class having relation with Abstract class and that abstract class is 
 having relation with 2 different interfaces */
 
package assignments;
interface Singing
{
	void albums();
}

interface Dance
{
	void hiphop();
}
abstract class Music implements Dance, Singing
{
	abstract void popmusic();
}
public class Abst_Inter_Asgmt54 extends Music
{	
	public static void main(String[] args) 
	{
		Abst_Inter_Asgmt54 a1 = new Abst_Inter_Asgmt54();
		a1.albums();
		a1.popmusic();
		a1.hiphop();
	}
	public void hiphop() 
	{
	 System.out.println("Hiphop");		
	}

	public void albums() 
	{
	 System.out.println("Albums");	
	}

	void popmusic() 
	{
		System.out.println("Popmusic");	
	}

}
