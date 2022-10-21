package IATI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
    @BeforeMethod
    public void login(){
        System.out.println("Logged in");
    }

    @AfterMethod
    public void logout(){
        System.out.println("Loggedout");
    }
    @Test(priority = 0)
    public void profile(){
        System.out.println("Thisis profile");
    }
    @Test(priority = 0)
    public void balance(){
        System.out.println("thisis bank balance");
    }
}
