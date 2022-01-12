package Class2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Priority extends CommonMethods {


    //test-perform login
    @Test (priority = 2)
    public void login() {
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        //@FindBy(id="txtUsername")
        //public WebElement username;
        //@FindBy (id="txtPassword")
        //public WebElement password;
        //
        //@FindBy(id="btnLogin")
        //public WebElement loginbtn;
    }
    @Test(priority = 1)
    public void validationOfTitle(){
        String actualTitle=driver.getTitle();
        String ExpectedTitle= "Human Management System";
        if(ExpectedTitle.equals(actualTitle)){
            System.out.println("Tested has passes");
        }else {
            System.out.println("Test has failed");
        }


    }


}

