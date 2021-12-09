package stepDefination;
import static helper.Helper.getWebDriver;

import cucumber.api.java.After;


public class Hooks {

    @After
    public void closeBrowser()
    {
        System.out.println(" Close the browser after test execution done");
        //getWebDriver().close();
    }
}
