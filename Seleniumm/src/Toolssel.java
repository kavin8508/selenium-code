import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolssel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.manage().window().maximize();
		//dr.findElement(By.id("alertButton")).click();
		WebElement ele = dr.findElement(By.id("promtButton"));
		((JavascriptExecutor)dr).executeScript("arguments[0].click()", ele);//scroll ddown
		Alert a = dr.switchTo().alert();
		String s =a.getText();
		System.out.println(s);
		//Thread.sleep(2000);
		a.sendKeys("Kavin");
		Thread.sleep(2000);
		//dr.switchTo().alert().accept();
		a.accept();
		
	}

}
