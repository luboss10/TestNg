package Class1;

import org.testng.annotations.Test;

public class FirstExample {
    @Test
    public void thirdTest(){                         //by default test cases are executed in alphabetical order
        System.out.println("I am third test");
    }

    @Test
    public void firstTest(){
            System.out.println("I am first test");
    }
    @Test
    public void secondTest(){
            System.out.println("I am second test");
        }

    }


