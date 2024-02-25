//131.Launch Flipkart hover over fashion and click on men's T-shirt
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Asgmt131 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fashion= driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		fashion.click();
		Actions a1 = new Actions(driver);
		a1.moveToElement(fashion).perform();
		WebElement shirt = driver.findElement(By.linkText("Men's T-Shirts"));
		shirt.click();	
	}	
}
