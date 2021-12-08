package StepDefinition;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import junit.framework.Assert;

public class BaseClass {

	public static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RayappanRaja\\eclipseOxegen\\SlideEgg\\driver\\chromedriver_96.exe");
		 driver= new ChromeDriver();
		 
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement loc,String in) {
		loc.sendKeys(in);
	}
	public static void click(WebElement loc) {
		loc.click();
	}
	public static void implicit() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static void explicit(WebElement e) {
		WebDriverWait w=new WebDriverWait(driver,1000);
		//Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(3000)).pollingEvery(Duration.ofMillis(20)).ignoring(Throwable.class);
		
		w.until(ExpectedConditions.visibilityOf(e));
	}
	public static void Javascript(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",e);
	}
	public static void pageLoad() {
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	}
	public static void close() {
		driver.close();
	}

	
     	 
 
}

