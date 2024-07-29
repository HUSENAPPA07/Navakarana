package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();   
		Thread.sleep(3000);

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);// Frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

		driver.switchTo().defaultContent();// go back to Main Page

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);// Frame2
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("To");

		driver.switchTo().defaultContent(); // go back to Main page

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);// Frame3
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Navakarana");

		driver.switchTo().defaultContent(); // go back to Main page

		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);// Frame4
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Tech");

		Thread.sleep(4000);
		driver.quit();

	}

}
