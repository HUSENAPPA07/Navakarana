package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_04_CSSLocators {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver .get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobiles");
		//driver.findElement(By.cssSelector(null))
	}

}
