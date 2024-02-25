//126.Count the number of links we have in amazon web page,locate using tag name
package assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AmazonLinks_Asgmt126 
{
	public static void main(String[] args) 
	{
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 List<WebElement>  links = driver.findElements(By.tagName("a"));
		 System.out.println("The number of links is : " + links.size());
		 for(int i=0;i<=links.size()-1;i++)
			{
				WebElement a=	links.get(i);
				String url1=	a.getAttribute("href");
				System.out.println(url1);
			}
	}

}
