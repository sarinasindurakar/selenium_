package OrangeHRM;

import Driver.chromedriver;
import Driver.orange_chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class addemployee extends orange_chrome {
    @Test(priority = 0)
    public void  login(){
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button') ]")).click();
    }
    @Test(priority = 1)
    public void addemployee() throws InterruptedException {
        driver.findElement(By.xpath("//li[contains(@class,\"oxd-topbar\")][3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstName")).sendKeys("Sarina");
        driver.findElement(By.name("middleName")).sendKeys("");
        driver.findElement(By.name("middleName")).sendKeys("");
        driver.findElement(By.name("lastName")).sendKeys("Sindurakar");
        driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("567");


    }
}

