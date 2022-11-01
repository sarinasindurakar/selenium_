package testng;

import org.testng.annotations.Test;


public class groupingtest {

    @Test(groups={"one"})
    void test1(){
        System.out.println("This is test1");
    }
    @Test(dependsOnGroups = "one",groups={"one"})
    void test2(){
        System.out.println("This is test2");
    }

    @Test
    void test3(){
        System.out.println("This is test3");
    }



}
