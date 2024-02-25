/*127.Launch www.flipkart.com page,search for books and click on second autosuggestion 
 use xpath to locate autosuggestions.*/
package assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FlipKartAuto_Asgmt127 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.name("q"));
		e1.sendKeys("books");
		Thread.sleep(1000);
		List<WebElement> m1= driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		int count =m1.size();
		System.out.println(count);
		Thread.sleep(1000);
		m1.get(3).click();
		
	}

}
