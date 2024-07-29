package My_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Timeout {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("Navakaran1");
		System.out.println("Text1 Entered Succesfully");

		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("Navakaran2");
		System.out.println("Text2 Entered Succesfully");

		driver.quit();

	}

}
