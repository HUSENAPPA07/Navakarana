package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AletrtBox02 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
//		//Click Button to see alert
//		driver.findElement(By.id("alertButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		
////		//On button click, alert will appear after 5 seconds
////		driver.findElement(By.id("timerAlertButton")).click();
////		System.out.println(driver.switchTo().alert().getText());
////		driver.switchTo().alert().accept();
//		
//		//confirm box
//		driver.findElement(By.id("confirmButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		
		//Click Button
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Alert Button
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("demo")));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("Navakaran");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("demo")));
		driver.quit();
		
	}

}
