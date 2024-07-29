package My_Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipacart_Task {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("earbuds",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='wjcEIp'])[3]")).click();
		Thread.sleep(3000);
		
		String parentWin = driver.getWindowHandle();
		
		Set<String> winHandle = driver.getWindowHandles();
		
		for(String winHandles : winHandle) {
			if(!parentWin.equals(winHandles)) {
				driver.switchTo().window(winHandles);
			}
		    }
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();

				//driver.findElement(By.xpath("(//div[@class='_4WELSP'])[1]")).click();
		

		
		
		
		
		
		
		
		
		
		
	}

}
