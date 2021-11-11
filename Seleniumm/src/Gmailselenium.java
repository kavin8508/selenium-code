import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://accounts.google.com/AccountChooser/identifier?flowName=GlifWebSignIn&flowEntry=AccountChooser");
		dr.manage().window().maximize();
		//dr.findElement(By.cssSelector("div[class='FliLIb DL0QTb']")).click();//next button by using cssselector
		//dr.findElement(By.xpath("//div[@class='FliLIb DL0QTb']")).click();//next button
		WebDriverWait w = new WebDriverWait(dr, 20);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='daaWTb']"))).click();//create account
		//dr.findElement(By.xpath("//div[@class='daaWTb']")).click();
		//Thread.sleep(1000);
		//dr.findElement(By.xpath("//li[@jsname='RZzeR']/span[2]")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@jsname='RZzeR']/span[2]"))).click();//create account for my self
		//Thread.sleep(2000);
		//dr.close();

	}

}
