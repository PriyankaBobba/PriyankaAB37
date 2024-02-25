package assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonPayment_Asgmt134 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FileInputStream f1 = new FileInputStream("/Users/sathvikbobba/Desktop/Automation/Selenium2/ExcelSheet/AmazonDetails.xlsx");
	    Workbook wb = WorkbookFactory.create(f1);
	    String un = wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	    String pswd = wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys(un);
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(pswd);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("pen");
		WebElement submit=driver.findElement(By.id("nav-search-submit-button"));
		submit.click();
		WebElement pen1 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
		pen1.click();
    	Thread.sleep(1000);
		WebElement addlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
		addlist.click();
		Thread.sleep(1000);
		WebElement createlist = driver.findElement(By.xpath("//*[@id=\"wl-redesigned-create-list\"]/span/span/input"));
		createlist.click();
		WebElement viewlist = driver.findElement(By.xpath("(//a[@class='a-button-text'])[2]"));
		viewlist.click();
	}

}
