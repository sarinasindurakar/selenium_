import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru_loginform {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        //taking the email  field by id slector
       // WebElement email=driver.findElement(By.id("email"));
        //email.sendKeys("sarina");

        //taking the password field by ID selector
       //WebElement password=driver.findElement(By.id("passwd"));
        //password.sendKeys("sarina");

        //name selector
        WebElement password=driver.findElement(By.name("passwd"));
        password.sendKeys("sarina");

        //xpath selector
        WebElement emm=driver.findElement(By.xpath("//input[@id='email']"));
               emm .sendKeys("saina@gmail.com");

       WebElement signinbutton=driver.findElement(By.id("SubmitLogin"));
       signinbutton.click();
       driver.close();







    }
}
