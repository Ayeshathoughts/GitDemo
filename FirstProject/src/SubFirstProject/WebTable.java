package SubFirstProject;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\basha\\Selenium course Udemy\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the column
	List<WebElement> elementList=driver.findElements(By.xpath("//tr/th[1]"));
	//capture text of all webelements into new (original) List
	List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list vs sorted list
	List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(originalList.equals(sortedList));
	List<String> price;
	//scan the name column with gettext->Beans->print the price of the rice
	do
	{
		List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s -> s.getText().contains("Rice"))

		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));
		if(price.size()<1)
		{

		driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
	}while(price.size()<1);
	
	}
			
	private static String getPriceVeggie(WebElement s) {

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
									
	}
}


