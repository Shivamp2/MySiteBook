package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By sampleProject = By.xpath("//span[contains(text(), ' Sample bungalow project')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProject(String projectName) {
        driver.findElement(sampleProject).click();
    }
}
