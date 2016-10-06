/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import seleniumguru.HomePage;
import seleniumguru.LoginPage;
import seleniumguru.RegisterPage;

/**
 *
 * @author ha.hoang
 */
public class TestBase {

    public static WebDriver createChromeDriver() {
        try {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            return new ChromeDriver(cap);
        } catch (Exception e) {
            System.out.println("Ex : " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) throws InterruptedException {
        HomePage homepage;
        LoginPage loginpage;
        RegisterPage regpage;

        WebDriver driver = null;
        try{
        driver = createChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://live.guru99.com/");
        driver.manage().window().maximize();

        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        regpage = new RegisterPage(driver);

        homepage.openRegisterPage();
        regpage.openRegister("ha", "hoang");
        homepage.openLogOutPage();
        Thread.sleep(5000);
        homepage.openLogInPage();
        Thread.sleep(5000);
        loginpage.openLoginPage("ha.hoang@niteco.se");
        
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
        
        //
    }
}
