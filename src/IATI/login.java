package IATI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://iatipublisher-dev.yipl.com.np/login");
        WebElement Username=driver.findElement(By.id("username"));
        Username.sendKeys("admin1234");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("12345678");
        WebElement signin=driver.findElement(By.xpath("//button[@id=\"btn\"]"));
         signin.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement search=driver.findElement(By.xpath("//input[@class=\"search__input mr-3.5\"]"));
        search.sendKeys("hello");
        search.sendKeys(Keys.ENTER);
        System.out.println("Search the activity in dashboard");


        WebElement searchresult=driver.findElement(By.xpath("//a[@class=\"overflow-hidden ellipsis text-n-50\"]"));
        assertTrue(searchresult.isDisplayed(),"the result is not displayed");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         WebElement logdrop=driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]"));
         logdrop.click();
        WebElement logout= driver.findElement(By.xpath("//button[@class=\"text-sm\"]"));
        logout.click();
        System.out.println("logout of the application");



    }
}
