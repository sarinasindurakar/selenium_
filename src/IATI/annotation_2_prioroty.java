package IATI;

import org.testng.annotations.*;

public class annotation_2_prioroty {
    @BeforeClass
    public void login(){
        System.out.println("Logged in");
    }

    @AfterClass
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
