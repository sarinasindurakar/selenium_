import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
public class test_example{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement password = driver.findElement(By.name("q"));
        password.sendKeys("abcdefghlkjl");


        driver.quit();


    }
}