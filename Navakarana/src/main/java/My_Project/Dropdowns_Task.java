package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_Task {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// To Scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

//		// To Select Value
		driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Group 1, option 2']")).click();
		System.out.println("Successful selectvalue Selected");
		Thread.sleep(3000);

		// To Select One
		// driver.findElement(By.xpath("//div[@id='selectOne']")).click();
		driver.findElement(By.id("selectOne")).click();
		driver.findElement(By.xpath("//div[text()='Mr.']")).click();
		System.out.println("Successful selectOne Selected");
		Thread.sleep(3000);

		// Old Style Select Menu
		driver.findElement(By.id("oldSelectMenu")).click();
		Select Dropdwn = new Select(driver.findElement(By.id("oldSelectMenu")));
		Dropdwn.selectByIndex(5);
		System.out.println("Successful oldstyle selectemenu Selected");
		Thread.sleep(3000);

		// Multiselect drop down
		driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		System.out.println("Multiselect drop down selected");
		Thread.sleep(3000);

		// Standard multi select
		driver.findElement(By.xpath("//option[text()='Audi']")).click();
		System.out.println("Audi selected");

	}
}