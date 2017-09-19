import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webdrivertest {
	
	@Test
	
	public void FirstTest(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/sanjaikru/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
	}

}
