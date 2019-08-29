package work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class first {  


	static void firstfunction()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");  
	}
	static void function1() throws AWTException
	{

		firstfunction();
		WebDriver driver=new ChromeDriver();
		// Launch website  
		driver.navigate().to("http://www.google.com/");  

		// Click on the search text box and send value  
		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("javatpoint tutorials");  

		// Click on the search button  
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);

		//	driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).click();
	}

	static void function2() throws AWTException, InterruptedException
	{
		firstfunction();
		//System.setProperty("webdriver.chrome.driver", "E:\\New_work\\work\\Driver\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();  
		driver1.navigate().to("https://www.toolsqa.com/automation-practice-form/?firstname=&submit=&photo=&continents=Asia");
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		driver1.manage().window().maximize();
		js.executeScript("window.scrollBy(0,500)");
		WebElement first= driver1.findElement(By.cssSelector("div.control-group input[name='firstname']"));
		first.sendKeys("Alok");
		driver1.findElement(By.cssSelector("input[value='Female']")).click();
		js.executeScript("window.scrollBy(0,500)");
		WebElement select=	driver1.findElement(By.cssSelector("input[id='profession-0']"));
		select.click();
		driver1.findElement(By.cssSelector("input[id='photo']")).sendKeys("C:\\Users\\alokm\\Pictures\\Image formate\\bmp.bmp");
/*		Robot robot = new Robot();
		for(int i = 0; i<9; i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		}

		for(int i = 0; i<7; i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Test 1");
	
	
	*/
	}
	static void function3() throws InterruptedException

	{
		firstfunction();
		WebDriver driver= new ChromeDriver();			

		//Creating the JavascriptExecutor interface object by Type casting		
		JavascriptExecutor js = (JavascriptExecutor)driver;		

		//Launching the Site.		
		driver.get("http://demo.guru99.com/V4/");			

		WebElement button =driver.findElement(By.name("btnLogin"));		


		//Login to Guru99 		
		driver.findElement(By.name("uid")).sendKeys("mngr34926");					
		driver.findElement(By.name("password")).sendKeys("amUpenu");					

		//Perform Click on LOGIN button using JavascriptExecutor		
		js.executeScript("arguments[0].click();", button);

		//To generate Alert window using JavascriptExecutor. Display the alert message 			
		js.executeScript("alert('Welcome to Guru99');"); 

	}
	static void fun4() throws InterruptedException
	{
		
		firstfunction();
		WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	 
			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
     		
     	 
  		    //Clicks the iframe
     		  Thread.sleep(1000);
  			System.out.println("*********We are done***************");
  			
  			
  			
  			
  			
  			String nam =driver.getTitle();
  			System.out.println("Let get title"+nam);
  			nam= driver.getCurrentUrl();
  			System.out.println("Let get URL"+nam);
  		//	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hello u are");
	
	}

	public static void main(String[] args) throws AWTException, InterruptedException  {  

		// declaration and instantiation of objects/variables 

		//function1();
		//function2();
		//function3();
		fun4();
	}  

}  
