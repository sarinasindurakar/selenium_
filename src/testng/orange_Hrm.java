package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class orange_Hrm extends webdriver {

    @Test(priority = 1)
    public void login(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    WebElement Username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        Username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement login=driver.findElement(By.xpath("//button[contains(@class,'oxd-button') ]"));
        login.click();

    }

    @Test(priority = 2,dependsOnMethods = {"login"})
    public void searchadmin(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement menuPIM = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        menuPIM.click();
        WebElement empUsername=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
        empUsername.sendKeys("aa");

        WebElement buttonSearch = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
        buttonSearch.click();

        System.out.println("Search For Employee");
    }
    @Test(priority = 3,dependsOnMethods = {"login"})
    public void logout(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement profile=driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]"));
        profile.click();

        WebElement logout=driver.findElement(By.xpath("//a[.=\"Logout\"]"));
        logout.click();

    }


}
