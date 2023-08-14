import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        
		driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
        for(int i=1;i<5;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
	}
 
}

