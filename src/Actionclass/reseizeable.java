package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class reseizeable{
        @Test
        public void resize() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://jqueryui.com/resizable/");

            Actions act = new Actions(driver);
            WebElement resize=driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\""));
            act.moveToElement(resize).dragAndDropBy(resize,400,100).build().perform();
            Thread.sleep(2000);
        }
}
