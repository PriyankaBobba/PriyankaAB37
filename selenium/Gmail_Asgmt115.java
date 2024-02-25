//115.Launch Google.com and click on gmail using linkText.
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail_Asgmt115 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();	
	}

}
