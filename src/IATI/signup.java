package IATI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://iatipublisher-dev.yipl.com.np/register");
        WebElement publisher=driver.findElement(By.id("publisher-name"));
        publisher.sendKeys("50 Eight Limited ");
        WebElement publisher_id=driver.findElement(By.id("publisher-id"));
        publisher_id.sendKeys("27693 ");
        WebElement organization_register=driver.findElement(By.id("registration-number"));
        organization_register.sendKeys("27693 ");
        WebElement country=driver.findElement(By.xpath("//input[@class=\"multiselect-search\"]"));
        country.click();
        country.findElement(By.xpath("//li[@id=\"multiselect-option-AF-CBR\"]")).click();

        WebElement nextbutton=driver.findElement(By.xpath("//button[@class=\"btn btn-next\"]"));
        nextbutton.click();




    }
}
