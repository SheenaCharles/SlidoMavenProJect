package org.example.slidopages;
import dataProvider.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest extends ConfigReader {

    protected static WebDriver driver;

    @BeforeMethod
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.slido.com/");
        driver.manage().window().maximize();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.doLogin(getEmail(), getPassword());
    }

    @AfterMethod
    public void afterSuite() {
        System.out.println("Closed Driver successfully.");
        driver.quit();
    }
}
