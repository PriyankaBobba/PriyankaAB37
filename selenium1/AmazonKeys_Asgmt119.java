//119.launch amazon.in select category dropdown,select Books using arrow down key 
//then search for software in search text field and press enter using keys function.
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonKeys_Asgmt119 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		for(int i=0;i<=10;i++)
		{
			driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software Testing");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
