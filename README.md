# Genie Registration UI Automation 🚀

This project automates the user registration process on the Genie platform using Selenium WebDriver and Cucumber framework in Java.  
It is designed to simulate a real user signing up with a temporary email address, stopping at the CAPTCHA validation step.

## 🧪 Scenario Summary

The automation script performs the following actions:

- Navigates to the Genie homepage
- Accepts the cookie notification
- Verifies the visibility of the "Login" button
- Clicks on "Login" and then selects "Sign up"
- Verifies that the registration form is loaded
- Opens a new browser tab to retrieve a temporary email address
- Switches back to the Genie tab and enters the fake email into the form
- Stops at the CAPTCHA step due to automation limitations

> ⚠️ CAPTCHA cannot be bypassed in automated tests, so the flow intentionally ends here.

## 📂 Project Structure

- `pages/` – Page Object classes for UI elements
- `stepDefinition/` – Cucumber step definitions
- `runners/` – Test runner for Cucumber execution
- `utilities/` – Helper classes (Driver, ConfigReader, ExcelReader, etc.)
- `features/` – Gherkin feature files
- `configuration.properties` – Config file for environment variables

## 🧰 Tech Stack

- Java 11  
- Selenium WebDriver  
- Cucumber  
- Maven  
- Page Object Model (POM)  
- Temporary Email Integration  
- GitHub for version control

## ▶️ How to Run

1. Clone this repository  
2. Open in IntelliJ or preferred IDE  
3. Run `TestRunner.java`  
4. Or execute from terminal using:

```bash
mvn clean test
