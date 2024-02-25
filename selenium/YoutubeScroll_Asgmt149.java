//149.Scroll down on youtube for infinite times
package assignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeScroll_Asgmt149 
{
	public static void main(String[] args) 
	{
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		for(int i=0; i<1; i--)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,9000)");	
		}
	}

}
