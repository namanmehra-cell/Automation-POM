package test;
import org.openqa.selenium.WebDriver;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = utilities.DRiverFactory.open("chrome");

		driver.get("https://www.saucedemo.com/");
		LoginPage lg = new LoginPage(driver);
		Shopping sh = new Shopping(driver);
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.click();
		sh.addCart();
		sh.cart();
		sh.buying();
		sh.addname("Rahul");
		sh.addlname("Raj");
		sh.addPostalCode("811214");
		sh.clickContinue();
		sh.clickFinish();
	}
	

}
