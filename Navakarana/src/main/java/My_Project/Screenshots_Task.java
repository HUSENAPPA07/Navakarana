package My_Project;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots_Task {

	private static final char[] Succesfully = null;

	public static void main(String[] args) throws Exception {

//		// Get ScreenShot
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://techreachall.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//
//		// File  
//		File SourceFile = driver.getScreenshotAs(OutputType.FILE);
//		File PathFile = new File("./ScreenshotImages/Img1.jpg");
//		FileUtils.copyFile(SourceFile, PathFile);
//		System.out.println("Succesfully captured Screenshot");q
//		Thread.sleep(3000);
//
//		// Bytes
//		byte[] ByteArr = driver.getScreenshotAs(OutputType.BYTES);
//		File PathFile1 = new File("./ScreenshotImages/Img2.jpg");
//		FileOutputStream fos = new FileOutputStream(PathFile1);
//		fos.write(ByteArr);
//		fos.close();
//		System.out.println("Succesfully captured Screenshot");
//		Thread.sleep(3000);
//
//		// Base64
//		String Base64code = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(Base64code);
//		File PathFile2 = new File("./ScreenshotImages/Img3.jpg");
//		FileOutputStream fos1 = new FileOutputStream(PathFile2);
//		fos1.write(ByteArr);
//		fos1.close();
//		System.out.println("Succesfully captured Screenshot");

		// TakeScreenShot
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://techreachall.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// File
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File SourceFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File PathFile = new File("./ScreenshotImages/Img1.jpg");
		FileUtils.copyFile(SourceFile, PathFile);
		System.out.println("Succesfully captured Screenshot");
		Thread.sleep(3000);

		// Bytes
		TakesScreenshot takescreenshot1 = (TakesScreenshot) driver;
		byte[] ByteArr = takescreenshot1.getScreenshotAs(OutputType.BYTES);
		File PathFile1 = new File("./ScreenshotImages/Img2.jpg");
		FileOutputStream fos = new FileOutputStream(PathFile1);
		fos.write(ByteArr);
		fos.close();
		System.out.println("Succesfully captured Screenshot");
		Thread.sleep(3000);

		// Base64
		TakesScreenshot takescreenshot2 = (TakesScreenshot) driver;
		String Base64code = takescreenshot2.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(Base64code);
		File PathFile2 = new File("./ScreenshotImages/Img3.jpg");
		FileOutputStream fos1 = new FileOutputStream(PathFile2);
		fos1.write(byteArr);
		fos1.close();
		System.out.println("Succesfully captured Screenshot");

		driver.quit();

	}

}
