package work;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	
	public static void fu2()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button#button1")).click();
		System.out.println("parentWindodd");
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it =	handle.iterator();
		
	String parentWindowId =	it.next();
	System.out.println("parentWindowId"+parentWindowId);
	
	String childWindowId =	it.next();
	System.out.println("childWindowId"+childWindowId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  fu2();
	}

}
