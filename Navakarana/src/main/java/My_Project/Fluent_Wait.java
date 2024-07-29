package My_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_Wait {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			FluentWait<WebDriver>wait =new FluentWait<WebDriver> (driver);
			
			wait.withTimeout(Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
		//	driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			WebDriverWait obj= new WebDriverWait(driver, Duration.ofSeconds(5));
			
			obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			
			System.out.println("Clicked Succesfully");
			
			driver.quit();
			
			
	}

}
