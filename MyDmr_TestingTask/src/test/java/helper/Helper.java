package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
   private static WebDriver webDriver;

    public static void openBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdriver\\chromedriver\\win\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }


    public static WebDriver getWebDriver() {
        return webDriver;
    }


}
