package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Shopping {
	WebDriver driver;
	Shopping(WebDriver dr){
		driver = dr;
	}
	public void addCart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		
	}
	public void cart() {
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
	}
	public void buying() {
		driver.findElement(By.id("checkout")).click();
	}
	public void addname(String name) {
		driver.findElement(By.id("first-name")).sendKeys(name);
	}
	public void addlname(String lname) {
		driver.findElement(By.id("last-name")).sendKeys(lname);
	}
	public void addPostalCode(String postalCode) {
		driver.findElement(By.id("postal-code")).sendKeys(postalCode);
	}
	public void clickContinue() {
		driver.findElement(By.id("continue")).click();
	}
	
	public void clickFinish() {
		driver.findElement(By.id("finish")).click();
	}
	
}
