import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String[] itemNeeded= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.name("signin")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		List<WebElement> products=driver.findElements(By.cssSelector("h4.card-title"));
		Thread.sleep(2000L);
		
		//List <WebElement> products = driver.findElements(By.cssSelector(".card-footer.btn-info"));

		/*for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}*/

		//driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		for(int i=0;i<products.size();i++)
		{
			int j=0;
			String name=products.get(i).getText();
			List<String>itemsNeededList=Arrays.asList(itemNeeded);
			if(itemsNeededList.contains(name))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='card-footer'] /button")).get(i).click();
				if(j==itemNeeded.length)
					break;
			}	
		}
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();

	}
}


