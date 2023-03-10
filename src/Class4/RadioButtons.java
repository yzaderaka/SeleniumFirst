package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        // check if button is enabled
        boolean isEnabledMale=maleBtn.isEnabled();
        System.out.println("The radio button male is enabled "+isEnabledMale);
        // check if button is displayed
        boolean isDisplayedMale= maleBtn.isDisplayed();
        System.out.println("The radio button male is displayed "+isDisplayedMale);
        // check if button is selected
        boolean isSelectedMale= maleBtn.isSelected();
        System.out.println("The radio button male is selected "+isSelectedMale);
        if (!isSelectedMale){
            maleBtn.click();
        }
        // check if selected button is selected after click
        isSelectedMale= maleBtn.isSelected();
        System.out.println("The status of selection is "+isSelectedMale);

    }
}
