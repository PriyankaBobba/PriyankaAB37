//117.Launch (JSAM) HTML page get elements by xpath(absolute xpath)
package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
public class Jsam_Asgmt117
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/sathvikbobba/Desktop/learningHTML1(1).html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("PriyankaB");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("name");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("abc@123");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Priyanka");
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		//driver.findElement(By.xpath("/html/body/a")).click();
	}

}
