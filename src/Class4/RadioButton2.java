package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //find all the age buttons
        List<WebElement> radiobtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioBTN: radiobtns){
            String age=radioBTN.getAttribute("value");
            System.out.println(radioBTN.getAttribute("value"));
            if (age.equalsIgnoreCase("0 - 5")){
                radioBTN.click();
            }
        }
    }
}
