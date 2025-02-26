package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage {
    private WebDriver driver;
    private By quotation = By.xpath("//p[contains(text(), ' Detailed Estimate')]");

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectQuotation(String quotationName) {
        driver.findElement(quotation).click();
    }
}
