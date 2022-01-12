package Class2;

import org.testng.annotations.*;

public class BeforeAndAfterClass {

    @BeforeClass
    public void beforeClass(){System.out.println("Im before class");}
    @AfterClass
    public void afterClass(){System.out.println("Im after class");}

    @BeforeMethod
    public void beforeMethod(){System.out.println("Im before method");}
    @AfterMethod
    public void afterMethod(){System.out.println("Im after method");}

    @Test
    public void thirdTest(){System.out.println("I am third test");}
    @Test
    public void firstTest(){System.out.println("I am first test");}
    @Test
    public void secondTest(){System.out.println("I am second test");}

}

