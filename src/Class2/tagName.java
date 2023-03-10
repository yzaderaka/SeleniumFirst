package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        // task - print all the links in the amazon.com
        driver.findElements(By.tagName("a"));
        /*
        8 locators
        id, name, class

        Linktext, partialintext(they can only be used for <a> and it must also have some Text
         */
    }
}
