import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/select-menu");
//		dr.get("https://demoqa.com/automation-practice-form");
		dr.manage().window().maximize();
		//dr.findElement(By.xpath("//div[@id='stateCity-wrapper']/div[2]/div/div/div/div")).click();
		dr.findElement(By.xpath("//div[@id='withOptGroup']/div/div[1]")).click();
	}

}
