import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
  
	WebDriver driver;

	  @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Resources\\Exe\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  long id = Thread.currentThread().getId();
		  System.out.println(id);
		  driver.quit();
	  }
	  
	  @AfterSuite
	  public void fsss() {

		  long id = Thread.currentThread().getId();
		  System.out.println("dddddd " + id);
		  

	  }

}
