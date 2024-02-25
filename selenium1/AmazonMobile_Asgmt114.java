//114.Launch Amazon and click on mobile tab.
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmazonMobile_Asgmt114 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
	}

}
