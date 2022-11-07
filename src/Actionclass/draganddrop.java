package Actionclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class draganddrop {
    @Test
    public void dragexample() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions act = new Actions(driver);
        //right click on button
        WebElement seoul = driver.findElement(By.id("box6"));
        WebElement korea = driver.findElement(By.id("box105"));
       // act.clickAndHold(seoul);
        Thread.sleep(3000);

       // act.moveToElement(korea).release().build().perform();
        act.dragAndDrop(seoul,korea).build().perform();
        Thread.sleep(3000);
        driver.quit();

    }
}

