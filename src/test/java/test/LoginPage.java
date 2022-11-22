package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
LoginPage(WebDriver dr){
	driver = dr;
	PageFactory.initElements(driver, this);
}
@FindBy(id="user-name")
WebElement username;
@FindBy(id="password")
WebElement pswd;
@FindBy(id="login-button")
WebElement btn;
public void enterUsername(String name) {
	username.sendKeys(name);
}
public void enterPassword(String pswod) {
	pswd.sendKeys(pswod);
}
public void click() {
	btn.click();
}

}
