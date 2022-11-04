package testng;

import Driver.chromedriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class openingnewtab {
    WebDriver driver;
    @Test
   public void  multiplebrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://iatipublisher-dev.yipl.com.np/login");
       driver.getTitle();
       Thread.sleep(2000);
       // opening the link in new tab
        driver.findElement(By.id("username")).sendKeys("admin1234");
        driver.findElement(By.id("password")).sendKeys("12345678");

      //  WebElement button=driver.findElement(By.xpath("//button[@id=\"btn\"]"));


       // Actions action=new Actions(driver);
        //action.keyDown(Keys.CONTROL).moveToElement(button).click().perform();

        String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
        // open the link in new tab, Keys.Chord string passed to sendKeys
        driver.findElement(
                By.xpath("//a[.=\"Join Now\"]")).sendKeys(clicklnk);

        //to switch to new tab
        ArrayList<String>currenthandle=new ArrayList<>(driver.getWindowHandles());
        //for new tab use 1
        //for parent window use  0
        driver.switchTo().window(currenthandle.get(1));




       /* url in new tab
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.orangehrm.com/");
       System.out.println("after switching the tab"+driver.getCurrentUrl());
      // driver.close();
*/
    }
}
