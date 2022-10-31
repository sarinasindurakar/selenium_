package testng;

import org.testng.annotations.Test;

public class dependencyexample {

    @Test
    void startcar(){

        System.out.println("car starting");
    }
   // @Test(dependsOnMethods = {"startcar"})
     //void  drivecar(){

       // System.out.println("car driving");
    //}
    @Test(dependsOnMethods={"drivecar"})
     void parkcar(){

        System.out.println("car parked");
    }
    @Test(dependsOnMethods = {"startcar","drivecar"})
    void stopcar(){
        System.out.println("car stopped");

    }

}
