package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("yzaderaka@mail.ru");
        driver.findElement(By.name("pass")).sendKeys("AA9882ip");
        //driver.findElement(By.linkText("Create new account")).click(); //выполняет поиск по тексту
        driver.findElement(By.partialLinkText("password?")).click(); // выполняет поиск по части текста
    }
}
