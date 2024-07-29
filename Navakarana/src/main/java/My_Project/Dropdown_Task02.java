package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Task02 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Select Dropdwn = new Select(driver.findElement(By.id("country")));
		Dropdwn.selectByIndex(9);
		Thread.sleep(3000);
		Dropdwn.selectByVisibleText("Australia");
		Thread.sleep(3000);
		Dropdwn.selectByValue("canada");

		driver.findElement(By.xpath("//option[text()='Red']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[text()='Green']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[text()='White']")).click();

		
		


	}

}
