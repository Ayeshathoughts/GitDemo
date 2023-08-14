import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
		a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().perform();
		
	}

}
