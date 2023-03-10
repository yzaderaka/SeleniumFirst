package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        // switch to the iframe which contains input box
        // method: by index
        driver.switchTo().frame(0);
        // this statement will
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("Yaroslav");


       /* WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is " + text.getText());*/

        WebElement getlabel = driver.findElement(By.xpath("//label"));
        System.out.println(getlabel.getText());

        //switch focus to the main page
        driver.switchTo().defaultContent();

        //clear the text box
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();
        driver.quit();

    }
}
