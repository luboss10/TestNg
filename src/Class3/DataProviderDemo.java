package Class3;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderDemo extends CommonMethods {


    @DataProvider
    public Object[][] data(){

        Object [][] login=new Object[3][2];
        login[0][0]="Admin";
        login[0][1]="Hum@nhrm123";
        login[1][0]="Admin";
        login[1][1]="Hum@nhrm123";
        login[2][0]="Admin";
        login[1][1]="Hum@nhrm123";
        return login;
    }



    //test-perform login
    @Test(groups = "regression", dataProvider = "data")
    public void login(String username,String password) {
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }


}