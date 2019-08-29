package work;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemove {

	public static void func() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		Actions action = new Actions(driver);
		WebElement Linktext=	driver.findElement(By.cssSelector("li#header-addons a#highlight-addons"));
	    action.moveToElement(Linktext).build().perform();
		Thread.sleep(5000);
		WebElement Linktext1 = driver.findElement(By.linkText("Hot Meals"));
		Thread.sleep(5000);
		action.moveToElement(Linktext1).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hot Meals")).click();
	}
	public static void func1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.cssSelector("div#draggable"))).moveToElement(driver.findElement(By.cssSelector("div#droppable"))).release().build().perform();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
	
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//func();
		func1();
		
	}

}
