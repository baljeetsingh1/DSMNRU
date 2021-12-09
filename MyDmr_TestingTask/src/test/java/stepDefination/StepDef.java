package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Constants;
import helper.Helper;
import org.junit.Assert;
import pageObjects.SignUpPage;

import java.util.Random;

import static helper.Helper.getWebDriver;

public class StepDef {
    private SignUpPage signUpPage;


    public StepDef(SignUpPage signUpPage) {
        this.signUpPage = signUpPage;

    }

    @Given("^I open sign up  page of myDsmnru website$")
    public void i_open_sign_up_page_of_myDsmnru_website() {
        Helper.openBrowser(Constants.LoginUrl);
        signUpPage.clickOnCreateAccountLink();
    }


    @When("^I enter my sign up details on sigh up page$")
    public void i_enter_my_sign_up_details_on_sigh_up_page() {
        getWebDriver().switchTo().activeElement();
        signUpPage.typeFirstName("Baljeet");
        signUpPage.typemiddleName("Singh");
        signUpPage.typelastnameField("deol");
        signUpPage.typeEmail("baljeetsinghdeol"+new Random().nextInt()+"@gmail.com");
        signUpPage.typeMobileNumber("1234567890");
        signUpPage.typePassword("Test@1234");
        signUpPage.typeconfirmpassword("Test@1234");

    }

    @When("^I click on register button$")
    public void i_click_on_register_button() {
        signUpPage.clickOnSignUpButton();
    }

    @Then("^I should see register confirmation dialog$")
    public void i_should_see_register_confirmation_dialog() {
        Assert.assertTrue(signUpPage.isConfirmationDialog());
    }

}