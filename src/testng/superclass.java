package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class superclass extends baseclass {
    @Test
    public void login(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Username=driver.findElement(By.id("username"));
        Username.sendKeys("admin1234");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("12345678");
        WebElement login=driver.findElement(By.xpath("//button[@id=\"btn\"]"));
        login.click();
        System.out.println("Login into the system");
        WebElement activities=driver.findElement(By.xpath("//h4[text()=' Your Activities ']"));
        Assert.assertTrue(activities.isDisplayed(),"The heading is not displayed");

    }
}
