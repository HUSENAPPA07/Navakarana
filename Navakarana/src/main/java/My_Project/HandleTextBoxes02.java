package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxes02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// TextBox Method

		WebElement UserTxt = driver.findElement(By.name("firstname"));
		if (UserTxt.isDisplayed()) {
			if (UserTxt.isEnabled()) {
				UserTxt.sendKeys("Navarakarn");
				String EnterTxt = UserTxt.getAttribute("Value");
				System.out.println(EnterTxt);
				Thread.sleep(3000);
				UserTxt.clear();

			} else
				System.out.println("The USername is not Enabled");
		} else
			System.out.println("The USername is not displayed");

	}

}
