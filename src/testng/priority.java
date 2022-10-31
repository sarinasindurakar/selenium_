package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.text.Highlighter;

public class priority {
    WebDriver driver;

    @BeforeClass
    public void setUp () throws Exception
    {
        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }
@Test
    public void signIn ()
    {
        driver.findElement(By.xpath("//div[@class='header_user_info']/a")).click();

        WebElement email = driver.findElement(By.id("email"));
        //Highlighter.highlightElement(driver, email);
        email.sendKeys("saina@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        //Highlighter.highlightElement(driver, password);
        password.sendKeys("sarina123");

        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
       // Highlighter.highlightElement(driver, buttonSignIn);
        buttonSignIn.click();

        System.out.println("1. Sign In");
    }
@Test
    public void searchTShirt ()
    {
        WebElement menu = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']"));
        //Highlighter.highlightElement(driver, menu);
        menu.click();

        WebElement searchBox = driver.findElement(By.id("search_query_top"));
       // Highlighter.highlightElement(driver, searchBox);
        searchBox.sendKeys("Blue");

        WebElement buttonSearch = driver.findElement(By.xpath("//*[@id='searchbox']/button"));
        //Highlighter.highlightElement(driver, buttonSearch);
        buttonSearch.click();

        System.out.println("2. Search For T-Shirt");
    }
@Test
    public void signOut ()
    {
        WebElement linkSignOut = driver.findElement(By.className("logout"));
        //Highlighter.highlightElement(driver, linkSignOut);
        linkSignOut.click();

        System.out.println("3. Sign Out");
    }

    @AfterClass
    public void tearDown () throws Exception
    {
        driver.quit();
    }
}

