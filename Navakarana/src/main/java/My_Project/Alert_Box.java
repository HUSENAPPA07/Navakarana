package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Box {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//Alert Box
		driver.findElement(By.id("js-alert")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("dialog-response")).getText()); 	
        Thread.sleep(3000);
        
        //Confirm Box
        driver.findElement(By.id("js-confirm")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("dialog-response")).getText());
        Thread.sleep(3000);
        

		// Prompt Box
		driver.findElement(By.id("js-prompt")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Navakaran");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("dialog-response")).getText());
		driver.quit();

	}

}
