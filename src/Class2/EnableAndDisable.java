package Class2;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test
    public void firstTest(){
        System.out.println("Im first");
    }
    @Test(enabled = false)
    public void secondTest(){
        System.out.println("Im second");
    }
    @Test
    public void thirdTest(){
        System.out.println("Im third");
    }
}
