/*132.Launch growtechminds drag and drop page,do drag a image and drop it 
in target place,do the reverse of it.*/
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop_Asgmt132 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("drag7"));
		WebElement drop = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		WebElement drag1 = driver.findElement(By.id("drag7"));
		WebElement drop1 = driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(drag1, drop1).perform();
		
	}

}
