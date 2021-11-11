import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kchandran25\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();//selenium
		String url = "https://www.flipkart.com/";
		dr.get(url);
		
//		String s =dr.getTitle();
//		int len = dr.getTitle().length();
//		System.out.println(s+" " + len);
//		Thread.sleep(2000);
//		dr.quit();
		dr.navigate().to("https://www.flipkart.com/mobile-phones-big-diwali-sale-23dew-f23-store?fm=neo%2Fmerchandising&iid=M_31afdee8-8fcb-43c3-a7a6-c6a3c6d0aa45_1_792OEL9WB5K2_MC.AIDH8F3BCTJQ&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Mobiles_AIDH8F3BCTJQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=AIDH8F3BCTJQ");
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(2000);
		dr.navigate().refresh();
		Thread.sleep(2000);
		dr.quit();
		

	}

}
