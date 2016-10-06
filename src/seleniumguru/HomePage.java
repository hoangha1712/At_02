/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumguru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author ha.hoang
 */
public class HomePage {
    WebDriver driver;
    By Account_link = By.xpath("//span[contains(.,'Account')]");
    By Register_link = By.xpath("//a[contains(.,'Register')]");
    By Log_In = By.xpath("//a[@title='Log In']");
    By Log_Out = By.xpath("//a[@title='Log Out']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage openRegisterPage() throws InterruptedException{
        driver.findElement(Account_link).click();
        Thread.sleep(5000);
        driver.findElement(Register_link).click();
        return new HomePage(driver);
    }
    
    public HomePage openLogInPage() throws InterruptedException{
        driver.findElement(Account_link).click();
        Thread.sleep(5000);
        driver.findElement(Log_In).click();
        return new HomePage(driver);
    }
    
    public HomePage openLogOutPage() throws InterruptedException{
        driver.findElement(Account_link).click();
        Thread.sleep(5000);
        driver.findElement(Log_Out).click();
        return new HomePage(driver);
    }
       
    
}
