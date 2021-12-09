package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static helper.Helper.getWebDriver;


public class PageObject {

    public void wait(int numberOfSeconds) {
        try {
            Thread.sleep(numberOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected WebElement element(By by) {

        return getWebDriver().findElement(by);
    }

    protected Select dropdown(By by) {

        return new Select(element(by));
    }


}
