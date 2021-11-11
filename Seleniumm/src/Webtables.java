

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
//		         *[@id="customers"]/tbody/tr[2]/td[1] 
//		         *[@id="customers"]/tbody/tr[3]/td[1] 
//		         *[@id="customers"]/tbody/tr[4]/td[1]
//		         *[@id="customers"]/tbody/tr[5]/td[1]
//		         *[@id="customers"]/tbody/tr[6]/td[1]
//		         *[@id="customers"]/tbody/tr[7]/td[1]

		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String aferxpath = "]/td[1]";

		List<WebElement> le = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int tab_row = le.size();
		System.out.println("table row" + tab_row);

		for (int i = 2; i <= tab_row; i++) {
			String actualxpath = beforexpath + i + aferxpath; //
			WebElement ele = driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText()); // print
			 //to find the element and position in the table
			if (ele.getText().equals("Centro comercial Moctezuma")) {
				System.out.println("company name : " + ele.getText() + "is found" + "position" + i);
				break;
			}
		}

		// 2nd colum
		String afterxpath2 = "]/td[2]";
		for (int i = 2; i <= tab_row; i++) {
			String xpath = beforexpath + i + afterxpath2;
			WebElement el = driver.findElement(By.xpath(xpath));
			System.out.println(el.getText());
		}

		System.out.println("******************");

		// company name
		String afterxpath3 = "]/td[3]";
		for (int i = 2; i <= tab_row; i++) {
			String xpath = beforexpath + i + afterxpath3;
			WebElement el = driver.findElement(By.xpath(xpath));
			System.out.println(el.getText());
		}
	
		
	
		

	}
}
