/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumguru;

import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author ha.hoang
 */
public class LoginPage {
    WebDriver driver;
    By Email_Ad = By.xpath("//input[contains(@id,'email')]");
    By PassWord = By.xpath("//input[@title='Password']");
    By LogIn_Button = By.xpath("//button[contains(@title,'Login')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public LoginPage openLoginPage (String email){
        driver.findElement(Email_Ad).sendKeys(email);
        driver.findElement(PassWord).sendKeys("1234567a");
        driver.findElement(LogIn_Button).click();
        return new LoginPage(driver);
    }
    
    
    
    
}
