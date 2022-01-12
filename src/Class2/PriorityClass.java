package Class2;

import org.testng.annotations.Test;

public class PriorityClass {
    @Test (priority = 2)
    public void firstTest(){
        System.out.println("im first");
    }
    @Test (priority = 3)
    public void secondTest() {
        System.out.println("im second");
    }
    @Test(priority = 1, enabled = false)
    public void thirdTest() {
        System.out.println("im third");
    }
}
