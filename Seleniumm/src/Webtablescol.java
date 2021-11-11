import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablescol {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// *[@id='customers']/tbody/tr/th[1]
		// *[@id='customers']/tbody/tr/th[2]
		// *[@id='customers']/tbody/tr/th[3]
		String befpath1 = "//*[@id=\"customers\"]/tbody/tr/th[";
		String aftpath1 = "]";
		
		List<WebElement> l = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
		int tab_col = l.size();
		System.out.println(tab_col);

		for (int i = 1; i <= tab_col; i++) {
			String path1 = befpath1 + i + aftpath1;
			WebElement kk = driver.findElement(By.xpath(path1));
			System.out.println(kk.getText());
		}
		driver.close();

	}

}
