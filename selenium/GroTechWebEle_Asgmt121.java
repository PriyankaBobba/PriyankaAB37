//121.Launch GrowTechminds registration form,locate every element except Dropdowns
//and Upload file button and perform action on each element using WebElement
package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class GroTechWebEle_Asgmt121 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fn = driver.findElement(By.id("fname"));
		fn.sendKeys("PriyankaB");
		WebElement un = driver.findElement(By.id("Username"));
		un.sendKeys("Priya");
		WebElement m = driver.findElement(By.id("Male"));
		m.click();
		WebElement f = driver.findElement(By.id("FeMale"));
		f.click();
		WebElement presentadd = driver.findElement(By.id("w3review"));
		presentadd.sendKeys("Hyd,343788");
		WebElement pin = driver.findElement(By.id("Pincode"));
		pin.sendKeys("450400");
		WebElement ln = driver.findElement(By.id("lname"));
		ln.sendKeys("Bobba");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("abc@123");
		WebElement permadd = driver.findElement(By.id("Address"));
		permadd.sendKeys("Blore,878979");
		WebElement agree = driver.findElement(By.id("Agree"));
		agree.click();
		WebElement submit = driver.findElement(By.xpath("//div[@ class='f1']/input"));
		submit.click();
		//WebElement upload = driver.findElement(By.id("Resume"));
		//upload.sendKeys("file:///Users/sathvikbobba/Desktop/MAnish%20Kumar%20Tiwari.pdf");	
	}

}
