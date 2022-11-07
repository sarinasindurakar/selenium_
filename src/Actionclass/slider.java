package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class slider {
    @Test
    public void slidertest(){
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");

        Actions act = new Actions(driver);
        //right click on button
        driver.switchTo().frame(0);
        WebElement  slider=driver.findElement(By.xpath("//span[contains(@class,\"ui-slider-handle\")]"));
        act.moveToElement(slider).dragAndDropBy(slider,300,0).build().perform();

    }
}
