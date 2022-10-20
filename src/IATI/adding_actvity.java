package IATI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class adding_actvity {
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

        // to make the driver wait for 30s
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // for activity button
        WebElement activitybutton= driver.findElement(By.xpath("//button[@class=\"button primary-btn relative font-bold\"]" ));
        activitybutton.click();
        //activity dropdown
        WebElement activity_drop= driver.findElement(By.xpath("//a[contains(.,'Add activity manually')]" ));
        activity_drop.click();

        WebElement activity_form= driver.findElement(By.xpath("//input[@class=\"form__input\"]" ));
        activity_form.sendKeys("hello");

        WebElement language= driver.findElement(By.xpath("//input[@class=\"multiselect-search\"]" ));
        language.click();
        language.findElement(By.xpath("//li[@id=\"multiselect-option-ab\"]")).click();

        WebElement activity_identifier= driver.findElement(By.xpath("//input[starts-with(@placeholder,'Type activity-identifier here')]" ));
        activity_identifier.sendKeys("232323");


        WebElement save_button= driver.findElement(By.xpath("//span[text()=\"Save\"]" ));
        save_button.click();

    }

}
