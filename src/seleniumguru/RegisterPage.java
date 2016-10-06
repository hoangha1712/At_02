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
public class RegisterPage {

    WebDriver driver;
    By Frist_Name = By.xpath("//input[contains(@name,'firstname')]");
    By Last_Name = By.xpath("//input[@id='lastname']");
    By Email_Address = By.xpath("//input[@id='email_address']");
    By PassWord = By.xpath("//input[@id='password']");
    By Confirm_Password = By.xpath("//input[@title='Confirm Password']");
    By Register_Password = By.xpath("//button[contains(@title,'Register')]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String randomEmai() {
        return "hahoang_" + UUID.randomUUID().toString() + "@gmail.com";

    }

    public RegisterPage openRegister(String firstName, String lastName) {
        String email = randomEmai();
        driver.findElement(Frist_Name).sendKeys(firstName);
        driver.findElement(Last_Name).sendKeys(lastName);
        driver.findElement(Email_Address).sendKeys(randomEmai());
        driver.findElement(PassWord).sendKeys("1234567a");
        driver.findElement(Confirm_Password).sendKeys("1234567a");
        driver.findElement(Register_Password).click();
        return new RegisterPage(driver);
    }

}
