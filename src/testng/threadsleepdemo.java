package testng;

import Driver.chromedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class threadsleepdemo extends chromedriver {
    @Test
    public void login() throws InterruptedException {

        driver.findElement(By.id("username")).sendKeys("admin1234");
        driver.findElement(By.id("password")).sendKeys("12345678");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id=\"btn\"]")).click();

    }
}
