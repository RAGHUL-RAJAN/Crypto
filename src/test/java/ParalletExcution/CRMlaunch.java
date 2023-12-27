package ParalletExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMlaunch {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
//	sdriver

}
