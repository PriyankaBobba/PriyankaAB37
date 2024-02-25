/* 71. WAP to display system time and date. Store day,date,month year values in String*/
 
package assignments;

import java.util.Date;

public class SysDateTime_Asgmt71 
{

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		//1000 ->ms, 60->sec, 60->msec, 24hrs in a day, 1-day
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println(d2);
		String mydate = d2.toString();
		String day = mydate.substring(0,3);
		System.out.println(day);
		String date = mydate.substring(8,10);
		System.out.println(date);
		String month = mydate.substring(4,7);
		System.out.println(month);
		String year = mydate.substring(24);
		System.out.println(year);
		System.out.println(month.concat("/").concat(date).concat("/").concat(year));	
		
	}

}
