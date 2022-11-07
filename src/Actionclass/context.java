package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class context {
    @Test
    public void contextexample() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement button = driver.findElement(By.xpath("//span[.=\"right click me\"]"));
        Actions act = new Actions(driver);
        //right click on button
        act.contextClick(button).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.=\"Delete\"]")).click();
        Thread.sleep(3000);
       System.out.println(driver.switchTo().alert().getText());//switching to alert and extracting the text
       driver.switchTo().alert().accept(); //switching and accept button





    }
}
