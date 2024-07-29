package My_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice02{
	
	public static void main (String []arg) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		//By using the locators
//		driver.findElement(By.name("email")).sendKeys("Demo");
//		driver.findElement(By.id("pass")).sendKeys("Demo@123");
//		driver.findElement(By.name("login")).click();
		
//		//By Using Abs Xpath
//		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("Demo");
//		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("Demo@123");
//		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();
//		
		
//		//By Using Relative Xpath
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Demo");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Demo@123");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//By Using and or in Xpath
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("Demo");
		driver.findElement(By.xpath("//input[@id='pass' or @class='email']")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//button[@name='login' or @class='_42ft _4jy0']")).click();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
