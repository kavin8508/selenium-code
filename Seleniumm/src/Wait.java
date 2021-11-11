import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.in/ref=nav_logo");
		dr.manage().window().maximize();
//		dr.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);//implict wait
//		dr.findElement(By.linkText("Mobiles")).click();
//		dr.close();
		
		
		//explict wait
		WebDriverWait wait = new WebDriverWait(dr, 21);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Mobiles"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobile Accessories"))).click();
		//Thread.sleep(3000);
		dr.close();

	

	}

}
