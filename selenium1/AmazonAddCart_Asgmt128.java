/*128.Launch amazon india search for shoes,select 30th shoe and add it 
 to the cart inspect shoes using xpath  */
package assignments;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAddCart_Asgmt128 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		WebElement submit=driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		WebElement shoes =driver.findElement(By.xpath("(//div[@ class='a-section aok-relative s-image-tall-aspect'])[30]"));
		shoes.click();
		Thread.sleep(1000);
		Set<String> parentandchildid =driver.getWindowHandles();
		System.out.println(parentandchildid);	
		Iterator<String> pcid = parentandchildid.iterator();
		String parentid1 = pcid.next();
		System.out.println(parentid1);
		String childid1=pcid.next();
		System.out.println(childid1);
		driver.switchTo().window(childid1);
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
	}
}
