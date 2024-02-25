//118.Login to facebook.com - write email and copy paste same in password
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class FBKeys_Asgmt118 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("priyachowdary09@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"A");
		driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"C");
		driver.findElement(By.id("pass")).sendKeys(Keys.COMMAND+"V");	
	}

}
