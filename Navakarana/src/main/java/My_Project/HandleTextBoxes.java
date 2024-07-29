package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleTextBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Text Functoin Menthod
		driver.findElement(By.xpath("//a[normalize-space()='This is a link']")).click();

		// TextBox Method
		WebElement UsernameTxt = driver.findElement(By.id("fname"));

		if (UsernameTxt.isDisplayed()) {
			if (UsernameTxt.isEnabled()) {
				UsernameTxt.sendKeys("Navakaran");
				String EnterdTxt = UsernameTxt.getAttribute("Value");
				System.out.println(EnterdTxt);
				Thread.sleep(3000);
				UsernameTxt.clear();

			} else
				System.out.println("Username is not Enabled");

		} else
			System.out.println("Username is not displayed");

		// Redio button
		driver.findElement(By.id("male")).click();
		

		// Select Method
		driver.findElement(By.xpath("//input[@class='Automation']")).click();
		driver.findElement(By.xpath("//input[@class='Performance']")).click();
		Thread.sleep(4000);
		//Unselect
		driver.findElement(By.xpath("//input[@class='Automation']")).click();
		driver.findElement(By.xpath("//input[@class='Performance']")).click();  

//		// Dropdown
//		Select obj = new Select(driver.findElement(By.id("testingDropdown")));
//		obj.selectByValue("Manual");
		driver.quit();
	}

}
