//125."Perform any action on the disabled component and find out which 
//exception we are getting

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsamDisable_Asgmt125 
{
	public static void main(String[] args)
	{
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///Users/sathvikbobba/Desktop/learningHTML1(1).html");
		  driver.findElement(By.id("121")).sendKeys("Bobba");
	}

}
