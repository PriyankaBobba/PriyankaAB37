//130.Launch online sbi link,click on login button, and inspect username,password and captcha
package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_Asgmt130 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.id("username")).sendKeys("Priya@123");
		driver.findElement(By.id("label2")).sendKeys("abc@123");
//		Thread.sleep(1000);
//		driver.findElement(By.id("imgselcaptcha")).sendKeys(Keys.COMMAND+"A");
//		driver.findElement(By.id("imgselcaptcha")).sendKeys(Keys.COMMAND+"C");
//		Thread.sleep(1000);
		driver.findElement(By.id("loginCaptchaValue")).sendKeys("Qwx8I");
	}
}
