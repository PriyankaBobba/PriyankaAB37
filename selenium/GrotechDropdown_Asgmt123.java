/*123.Launch grotechminds registration form and locate dropdowns skills,
country and religion perform action on them*/
package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechDropdown_Asgmt123 
{	
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement skills_dd = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills_dd);
		s1.selectByValue("select1");
		
		WebElement country_dd = driver.findElement(By.id("Country"));
		Select s2 = new Select(country_dd);
		s2.selectByVisibleText("India ");
		
		WebElement relegion_dd = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(relegion_dd);
		s3.selectByIndex(4);	
	
	}
	

}
