Selenium Automation Framework for SiteBook

📌 Project Overview

This project is a Selenium-based automation framework developed in Java to automate the validation of project quotations on mysitebook.io. It follows the Page Object Model (POM) and integrates TestNG for test execution and reporting.

📂 Project Structure

SiteBookAutomation
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── base
│   │   │   │   ├── BaseTest.java
│   │   │   ├── pages
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── ProjectPage.java
│   │   │   │   ├── QuotationPage.java
│   │   │   ├── utils
│   │   │   │   ├── ConfigReader.java
│   ├── resources
│   │   │   ├── config.properties
│   ├── test
│   │   ├── java
│   │   │   ├── tests
│   │   │   │   ├── ValidateQuotationTest.java
│── pom.xml
│── test-output (generated by TestNG)
│── README.md

⚙️ Technologies Used

Java (Programming Language)

Selenium WebDriver (Automation Testing)

TestNG (Test Execution & Reporting)

Maven (Dependency Management)

Git (Version Control)

🚀 Features Implemented

✔ Modular Page Object Model (POM) for Maintainability
✔ Dynamic Table Extraction for Quotation Validation
✔ Reusable Utility Classes for Configuration Handling
✔ Configurable Test Execution using config.properties
✔ Failed Test Reporting with Assumed Incorrect Values
✔ Detailed TestNG HTML Reports for Test Execution

🔧 Setup & Execution

🔹 Prerequisites

Install Java JDK (11+)

Install Eclipse/IntelliJ

Install Maven

Add ChromeDriver to System PATH

🔹 Clone the Repository

git clone https://github.com/yourusername/MySiteBook.git
cd SiteBookAutomation

🔹 Configure config.properties

baseURL=https://mysitebook.io/
username=your-email@example.com
password=your-password
browser=chrome

🔹 Run Tests using Maven

mvn test

🔹 Generate Test Report

Test results are available in:

test-output/index.html

Open this file in a browser to view the detailed TestNG report.

📌 Test Case Example

The automation script performs the following:

Login to the portal

Select the “Sample Bungalow Project”

Open the “Detailed Estimate” quotation

Validate section details (Quantity, Unit, Total Cost)

Log test results (Pass/Fail) and generate a report
