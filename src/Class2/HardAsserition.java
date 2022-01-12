package Class2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAsserition extends CommonMethods {


    @Test
    public void validationOfTitle() {
        String actualTitle = driver.getTitle();
        String ExpectedTitle = "Human Management System";
        Assert.assertEquals(actualTitle, ExpectedTitle);  //instead of if else condition

        WebElement username=driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(username.isDisplayed());
        System.out.println("Im test code");

    }

}