//110.WAP to launch Google using get in selenium
package assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchGoogle_Asgmt110 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

}
