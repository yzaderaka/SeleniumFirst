package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1324946793%3A1678243208426028&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHepAJKZfLwcxsrCjZu4DvMz3VJxFRjW0M92vGCVTwYNfIqmMW1CxiqbzDRjsEMfCN-yU_fRVA");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentWindowHandle= driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        Set<String> windowHandles=driver.getWindowHandles();

        for (String s: windowHandles){
            System.out.println(s);
        }
    }
}
