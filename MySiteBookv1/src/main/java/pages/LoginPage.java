package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    
    private By LoginYellow = By.className("yellow-btn");
    private By contactField= By.id("mobileNumber");
    private By continueButton = By.xpath("//button[@type='submit']");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[normalize-space() ='Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String contact, String password) {
    	driver.findElement(LoginYellow).click();
    	String currHandle=driver.getWindowHandle();
    	Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        driver.findElement(contactField).sendKeys(contact);
        driver.findElement(continueButton).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
