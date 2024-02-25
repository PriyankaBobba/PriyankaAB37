//Handle javascript popup of grotechminds application and get the title of the page
package assignments;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GroTechPopup_Asagmt129 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String t1 = driver.getTitle();
		System.out.println(t1.toString());	
	}

}
