//116.Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.
package assignments;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AmazonLinks_Asgmt116 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value to choose the country");
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
			driver.findElement(By.partialLinkText("Emirates")).click();
			break;
		case 2:	
			driver.findElement(By.partialLinkText("Kingdom")).click();
			break;
		case 3:
			driver.findElement(By.partialLinkText("States")).click();	
		}	
	}
}
