package work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuphandly {
	
	static void x() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		String text= alt.getText();
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("correct method");
		}
		else 
		{
			System.out.println("correct method");
		}
			
		
		
		alt.accept(); // click on on button
		//alt.dismiss();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		x();
		
	}

}
