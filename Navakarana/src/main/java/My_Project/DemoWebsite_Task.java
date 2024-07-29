package My_Project;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebsite_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("husenappa2000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hsp@7760");
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); // Login Done
		
		driver.findElement(By.linkText("Apparel & Shoes")).click(); //To Open Shoes page
		driver.findElement(By.linkText("Blue and green Sneaker")).click(); //to click shoes
		driver.findElement(By.xpath("//span[@title='Black']")).click();  //to select color
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-28']")).click(); // Add to Wishlist
		
		driver.findElement(By.linkText("Books")).click();    //To Open book page
		driver.findElement(By.linkText("Health Book")).click(); //to click the book
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-22']")).click(); //Add to Wishlist
		
		driver.findElement(By.linkText("Jewelry")).click(); //to open Jewelry
		driver.findElement(By.linkText("Create Your Own Jewelry")).click(); //to click the Jewelry
		driver.findElement(By.xpath("//input[@id='product_attribute_71_10_16']")).sendKeys("20cm");
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-71']")).click(); //Add to Wishlist
		
		 driver.findElement(By.linkText("Wishlist")).click();  //to open Wishlist
		
		driver.findElement(By.xpath("(//input[@name='removefromcart'])[3]")).click(); //To Remove shoes
		driver.findElement(By.xpath("//input[@value='Update wishlist']")).click(); //to Update the WishList
		
		//To Add Cart
		driver.findElement(By.xpath("//input[@name='addtocart']")).click();
		driver.findElement(By.xpath("(//input[@name='addtocart'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();  // to update the add Cart
		
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click(); //to click the agree box
		driver.findElement(By.xpath("//button[@id='checkout']")).click();  // to click the checkbox
		
		//to change the adress
		Select obj = new Select(driver.findElement(By.xpath("//select[@id='billing-address-select']")));
		obj.selectByVisibleText("New Address");
		
		//to Enter the Billing Adress
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Navakarana");
		Select obj2 = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		obj2.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Hyderabad");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Navakarana");
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Madhapur");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("500081");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("7760229015");
		driver.findElement(By.xpath("//input[@title='Continue']")).click(); // to to Continue
		
		WebElement obj3= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']"))); //to click Instore pickup
		obj3.click();
		WebElement obj4= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]"))); //Continue
		obj4.click();
		
		//to Back 
		
		WebElement obj5= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@onclick='Checkout.back(); return false;'])[3]"))); //Payment Method Back
		obj5.click();
		WebElement obj6= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Back"))); //Shipping Adress back
		obj6.click();
		
		//Again Continue
		WebElement obj17= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Continue']")));
		obj17.click();
		WebElement obj8= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']"))); //to click Instore pickup
		obj8.click();
		WebElement obj9= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]"))); //Continue
		obj9.click();
		
		//Payment Method
		WebElement obj10= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='paymentmethod_2']"))); //To click Card
		obj10.click();
		WebElement obj11= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 payment-method-next-step-button']"))); //Continue
		obj11.click();
		
		//Enter the card Details
		WebElement obj12= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='CardholderName']"))); //To Enter the card name
		obj12.sendKeys("HUSENAPPA");
		WebElement obj13= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='CardNumber']"))); //To Enter the card Number
		obj13.sendKeys("779988446622");
		
		Select obj18= new Select(driver.findElement(By.id("ExpireMonth")));
		obj18.selectByVisibleText("10");
		Select obj14= new Select(driver.findElement(By.id("ExpireYear")));
		obj14.selectByVisibleText("2025");
		WebElement obj15= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='CardCode']"))); //To Enter the card Code
		obj15.sendKeys("107");
		WebElement obj16= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 payment-info-next-step-button']"))); // Continue
		obj16.click();
		
		//Logout
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		//Screenshot
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File Source = takescreenshot.getScreenshotAs(OutputType.FILE);
		File Path =new File("./,ScreenshotImages/img1 jpg");
		FileUtils.copyFile(Source, Path);
		System.out.println("Task is Completed and Captured Screenshot Sucussefully");
		
		driver.quit();
		
	}

}
