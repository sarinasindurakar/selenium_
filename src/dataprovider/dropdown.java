package dataprovider;

import Driver.chromedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class dropdown extends chromedriver {

@Test(priority = 1)
public void login(){
    WebElement Username=driver.findElement(By.id("username"));
    Username.sendKeys("admin1234");
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("12345678");
    WebElement signin=driver.findElement(By.xpath("//button[@id=\"btn\"]"));
    signin.click();
    System.out.println("login");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
@Test(priority=2)
    public void dropdown(){

        driver.findElement(By .xpath(".//button[@class=\"button primary-btn relative font-bold\"]")).click();
        driver.findElement(By.xpath("//a[contains(.,'Add activity manually')]")).click();
        List< WebElement> options=driver.findElements(By.xpath("//a[contains(@class,'block p-2.5') ]"));
        for (WebElement option:options){
            System.out.println(option.getText());
        }

    }

}
