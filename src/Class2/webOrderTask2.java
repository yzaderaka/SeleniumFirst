package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        String title= driver.getTitle(); // title is "Web Orders"
        if (title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct");
        }else {
            System.out.println("The title is incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();



    }
}
