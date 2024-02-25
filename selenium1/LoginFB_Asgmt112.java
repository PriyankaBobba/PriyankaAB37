//112.Login to Facebook using id,name locator
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFB_Asgmt112 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("priyachowdary09@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcd@12367");
		driver.findElement(By.name("login")).click();
	}
}
