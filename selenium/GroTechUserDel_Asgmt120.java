//120.Launch GrowTechminds registration form,for firstname textfield enter name as
//Manish Kumar Tiwari,remove Tiwari from it using Keys option
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class GroTechUserDel_Asgmt120 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		for(int i=0; i<=6;i++ )
		{
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		}
		


	}

}
