package IATI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://iatipublisher-dev.yipl.com.np/login");
        WebElement Username=driver.findElement(By.id("username"));
        Username.sendKeys("admin1234");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("123456789");
        WebElement signin=driver.findElement(By.xpath("//button[@id=\"btn\"]"));
         signin.click();
//         String activityurl=driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         WebElement activitybutton= driver.findElement(By.xpath("//button[@class=\"button primary-btn relative font-bold\"]" ));
         activitybutton.click();
         //actiivtvy dropdown
            WebElement activity_drop= driver.findElement(By.xpath("//a[contains(.,'Add activity manually')]" ));
            activity_drop.click();
            


       // System.out.println("Successfully login");
       // System.out.println("activityurl="+activityurl);





    }
}
