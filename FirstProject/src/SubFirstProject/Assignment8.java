package SubFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("autocomplete")).sendKeys("uni");
		
		//driver.get("http://qaclickacademy.com/practice.php");

	    driver.findElement(By.id("autocomplete")).sendKeys("uni");

	    Thread.sleep(2000);

	    
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

	       

	       

	}

	



	}


