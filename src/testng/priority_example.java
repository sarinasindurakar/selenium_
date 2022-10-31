package testng;

import org.testng.annotations.Test;

public class priority_example {
    @Test(priority = 0)
    public void set()
    {
        System.out.println("this is test1");
    }
    @Test(priority = 1)
    public void sets()
    {
        System.out.println("this is test2");
    }
    @Test(priority = 2,enabled = false)
    public void done()
    {
        System.out.println("this is test3");
    }
}
