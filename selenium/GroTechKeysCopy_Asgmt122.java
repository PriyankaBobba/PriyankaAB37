//122.Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" 
//in the firstname and copy paste in all 4 text fields using keys
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class GroTechKeysCopy_Asgmt122 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Priyanka Bobba");
		driver.findElement(By.id("fname")).sendKeys(Keys.COMMAND+"A");
		driver.findElement(By.id("fname")).sendKeys(Keys.COMMAND+"c");
		driver.findElement(By.id("Username")).sendKeys(Keys.COMMAND+"V");
		driver.findElement(By.id("lname")).sendKeys(Keys.COMMAND+"V");
		driver.findElement(By.id("password")).sendKeys(Keys.COMMAND+"V");
	}

}
