package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        // connect to webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // initiate the instance of webDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().back();
        driver.navigate().to("https://itc.ua");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();



    }
}
