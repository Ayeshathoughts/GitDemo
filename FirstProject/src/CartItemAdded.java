import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class CartItemAdded {

	public static void main(String[] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		String[] itemNeeded= {"Cucumber","Beetroot","Brocoli","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		

	}
	public static void addItems(WebDriver driver,String[] itemNeeded)
	{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List<String>itemsNeededList=Arrays.asList(itemNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemNeeded.length)
					break;
			}
			
		}
	}

}
