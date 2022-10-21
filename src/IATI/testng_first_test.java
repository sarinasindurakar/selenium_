package IATI;

import org.testng.annotations.Test;

public class testng_first_test {
    @Test
    void setup(){
        System.out.println("I am setup");

    }
    @Test
    void testSteps(){
        System.out.println("I am inside setup");

    }
    @Test
    void teardown(){ System.out.println("I am hello");
    }
}
