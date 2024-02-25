//111.Get the title of flipkart.com and save each word in an array
package assignments;

import java.util.Arrays;

import org.openqa.selenium.edge.EdgeDriver;

public class Title_Asgmt111 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String s1 = driver.getTitle();
		String s2[] = s1.split(" ");
		System.out.println(Arrays.toString(s2));
	}
}
