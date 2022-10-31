package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iati_activity {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://iatipublisher-dev.yipl.com.np/login");
    }
    @Test(priority = 1)
    public void login(){
        WebElement Username=driver.findElement(By.id("username"));
        Username.sendKeys("admin1234");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("12345678");
        WebElement signin=driver.findElement(By.xpath("//button[@id=\"btn\"]"));
        signin.click();
        System.out.println("login");

    }

    @Test(priority = 2)
    public void url(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement activities=driver.findElement(By.xpath("//h4[contains(@class,\"mr-4 text-3xl\")]"));
        Assert.assertTrue(activities.isDisplayed(),"Login sucessful");

    }
    @Test(priority = 3)
    public void addactivity(){
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement activitybutton= driver.findElement(By.xpath("//button[@class=\"button primary-btn relative font-bold\"]" ));
        activitybutton.click();
        //activity dropdown
        WebElement activity_drop= driver.findElement(By.xpath("//a[contains(.,'Add activity manually')]" ));
        activity_drop.click();

        WebElement activity_form= driver.findElement(By.xpath("//input[@class=\"form__input\"]" ));
        activity_form.sendKeys("assert");

       // WebElement language= driver.findElement(By.xpath("//input[@class=\"multiselect-search\"]" ));
        //language.click();
       // language.findElement(By.xpath("//li[@id=\"multiselect-option-ab\"]")).click();

        WebElement activity_identifier= driver.findElement(By.xpath("//input[starts-with(@placeholder,'Type activity-identifier here')]" ));
        activity_identifier.sendKeys("676");


        WebElement save_button= driver.findElement(By.xpath("//span[text()=\"Save\"]" ));
        save_button.click();



    }
    /*
    @Test(priority = 4)
    public void activitylist(){
        WebElement activity=driver.findElement(By.xpath("//a[.=\"assert\"]"));
        //activity.isDisplayed();

        Assert.assertTrue(activity.isDisplayed());
    }
    /*
   @AfterClass
    public void close(){
        System.out.println("Close Browser");
        driver.quit();
   }

     */

}
