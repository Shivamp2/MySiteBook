package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProjectPage;
import pages.QuotationPage;
import utils.ConfigReader;

public class ValidateQuotationTest extends BaseTest {
    @Test
    public void validateQuotationDetails() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));

        HomePage homePage = new HomePage(driver);
        homePage.selectProject("Sample bungalow project");

        ProjectPage projectPage = new ProjectPage(driver);
        projectPage.selectQuotation("Detailed Estimate");

        QuotationPage quotationPage = new QuotationPage(driver);
        
     // Valid Cases
        Assert.assertTrue(quotationPage.validateQuotationDetails("Ground Flooring", "2404.57", "sqft", "2,36,550.44"));
        Assert.assertTrue(quotationPage.validateQuotationDetails("Tiling", "1200", "sqft", "1,50,000"));

        // Failed Case (Assumed incorrect values)
        Assert.assertFalse(quotationPage.validateQuotationDetails("Front Yard", "549.18", "sqft", "449.12"));
    }
}
