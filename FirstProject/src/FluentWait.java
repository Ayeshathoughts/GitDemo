import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		Wait<WebDriver> wait=new FluentWait(driver).wait(30).pollingEvery(Duration.ofSeconds((3)));
		WebElement foo=wait.until(new Function<WebDriver,WebElement>()
		
		{
			public WebElement apply(WebDriver driver)
			{
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
				{
				 return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else
					return null;
				}
			
		
			});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}
}

