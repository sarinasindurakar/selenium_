package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class IATI_annotations extends webdriver{

    @BeforeClass
    public void openapplication(){
        driver.get("https://iatipublisher-dev.yipl.com.np/login");

    }
    @BeforeMethod
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
    @Test(priority = 1)
     public void searchactivity(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement search=driver.findElement(By.xpath("//input[@class=\"search__input mr-3.5\"]"));
        search.sendKeys("hello");
        search.sendKeys(Keys.ENTER);
        System.out.println("Search the activity in dashboard");
        WebElement searchresult=driver.findElement(By.xpath("//a[@class=\"overflow-hidden ellipsis text-n-50\"]"));
        Assert.assertTrue(searchresult.isDisplayed(),"the result is not displayed");
     }

     @Test(priority = 2)
    public void addactivity() {
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         WebElement activitybutton = driver.findElement(By.xpath("//button[@class=\"button primary-btn relative font-bold\"]"));
         activitybutton.click();
         WebElement activitydrop = driver.findElement(By.xpath("//a[contains(.,'Add activity manually')]"));
         activitydrop.click();
         System.out.println("adding  the activity");
         WebElement activity_form = driver.findElement(By.xpath("//input[@class=\"form__input\"]"));
         activity_form.sendKeys("example");
         WebElement activity_identifier = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Type activity-identifier here')]"));
         activity_identifier.sendKeys("345");
         WebElement save_button = driver.findElement(By.xpath("//span[text()=\"Save\"]"));
         save_button.click();
     }

     @AfterMethod
    public void logout(){
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         WebElement logdrop=driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]"));
         logdrop.click();
         WebElement logout= driver.findElement(By.xpath("//button[@class=\"text-sm\"]"));
        logout.click();
         System.out.println("logout of the application");
     }

     @AfterTest
    public void closechrome(){
         System.out.println("close the chrome");
            driver.quit();
     }


    public static void main(String[] args) {
        IATI_annotations obj= new IATI_annotations();
        obj.setproperty();
        obj.openapplication();
        obj.login();
        obj.searchactivity();
        obj.addactivity();
        obj.logout();
        obj.closechrome();
    }



}
