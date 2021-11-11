import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.in/ref=nav_logo");
		dr.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(dr, 20);
		w.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Mobiles"))).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='nav-subnav']/a[4]/span[1]"))).click();
		//w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='navSwmHoliday']"))).click();
		//Thread.sleep(2000);
		dr.close();
		//div[@jsname='WjL7X']/div
	}

}
