package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import java.util.List;

public class QuotationPage {
    private WebDriver driver;
    private By quotationTable = By.cssSelector("table.table tbody tr");

    public QuotationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getQuantity(String description) {
        return getQuotationDetail(description, 2);
    }

    public String getUnit(String description) {
        return getQuotationDetail(description, 3);
    }

    public String getTotalCost(String description) {
        return getQuotationDetail(description, 5);
    }

    private String getQuotationDetail(String description, int columnIndex) {
        List<WebElement> rows = driver.findElements(quotationTable);
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            if (columns.size() > columnIndex && columns.get(1).getText().trim().equalsIgnoreCase(description)) {
                return columns.get(columnIndex).getText().trim();
            }
        }
        return "Not Found";
    }

    public boolean validateQuotationDetails(String description, String expectedQuantity, String expectedUnit, String expectedTotalCost) {
        String actualQuantity = getQuantity(description);
        String actualUnit = getUnit(description);
        String actualTotalCost = getTotalCost(description);

        boolean quantityMatch = actualQuantity.equals(expectedQuantity);
        boolean unitMatch = actualUnit.equals(expectedUnit);
        boolean costMatch = actualTotalCost.equals(expectedTotalCost);

        Reporter.log("Validating: " + description, true);
        Reporter.log("Expected - Quantity: " + expectedQuantity + ", Unit: " + expectedUnit + ", Total Cost: " + expectedTotalCost, true);
        Reporter.log("Actual - Quantity: " + actualQuantity + ", Unit: " + actualUnit + ", Total Cost: " + actualTotalCost, true);

        if (!quantityMatch || !unitMatch || !costMatch) {
            Reporter.log("Test FAILED for: " + description, true);
            return false;
        }

        Reporter.log("Test PASSED for: " + description, true);
        return true;
    }
}
