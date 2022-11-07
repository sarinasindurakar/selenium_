package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class actionexample {
  @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Setting the property of driver");

        WebElement Username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        Username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement login=driver.findElement(By.xpath("//button[contains(@class,'oxd-button') ]"));
        login.click();

      //mouseover
      WebElement admin= driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]"));
      Actions act=new Actions(driver);
      act.moveToElement(admin).click().build().perform();//tomouseover and click on admin
      driver.findElement(By.xpath("(//li[@class=\"oxd-topbar-body-nav-tab --parent\"])[1]")).click();
      WebElement jobtitles=driver.findElement(By.xpath("(//a[contains(@class,\"oxd-topbar-body-\")])[1]"));
      act.moveToElement(jobtitles).build().perform();//mouseover and click on jobtitles
      Thread.sleep(3000);
    }

}
