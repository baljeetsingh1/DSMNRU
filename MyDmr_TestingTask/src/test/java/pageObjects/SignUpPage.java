package pageObjects;

import helper.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static helper.Helper.getWebDriver;

public class SignUpPage extends PageObject {
    By createAccountLink = By.linkText("Register");
    By firstNameField = By.xpath("//input[@name='first_name']");
    By middleNameFiled = By.xpath("//input[@name='middle_name']");
    By lastnameField = By.xpath("//input[@name='last_name']");
    By emailField = By.xpath("//input[@name='email']");
    By mobileNumberField = By.xpath("//input[@name='mobile']");
    By passwordField = By.xpath("//input[@name='password']");
    By confirmpasswordFiled = By.xpath("//input[@name='password_confirmation']");
    By signupButton = By.xpath("//input[@type='button']");
    By confirmationDialog = By.xpath("//p[contains(text(),'Registered Successfully.')]");

    public void clickOnCreateAccountLink() {
        element(createAccountLink).click();
        wait(5);
    }

    public void typeFirstName(String firstName) {
        element(firstNameField).sendKeys(firstName);
    }

    public void typemiddleName(String middleName) {
        element(middleNameFiled).sendKeys(middleName);
    }

    public void typelastnameField(String lastname) {
        element(lastnameField).sendKeys(lastname);
    }

    public void typeEmail(String email) {
        List<WebElement> emailfields = getWebDriver().findElements(emailField);
        emailfields.get(1).sendKeys(email);
    }

    public void typeMobileNumber(String mobileNumber) {
        element(mobileNumberField).sendKeys(mobileNumber);
    }

    public void typePassword(String password) {
        List<WebElement> passwordFileds = getWebDriver().findElements(passwordField);
        passwordFileds.get(1).sendKeys(password);
    }

    public void typeconfirmpassword(String confirmpassword) {
        element(confirmpasswordFiled).sendKeys(confirmpassword);

    }

    public void clickOnSignUpButton() {
        List<WebElement> registerButton = getWebDriver().findElements(signupButton);
        registerButton.get(1).click();
    }

    public boolean isConfirmationDialog() {
        return element(confirmationDialog).isDisplayed();
    }

}

