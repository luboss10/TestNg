package Class2;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println("im login test"); //has to pass in order for second on to work
    }
    @Test (dependsOnMethods = "login")
    public void verificationOfDashboard(){
        System.out.println("Im depandent scenario");
    }
}
