package org.example.slidopages;
import dataProvider.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicSetupPageTest extends ConfigReader {

    protected static WebDriver driver;
//    String platform = System.getenv("platform");
//    String browser= System.getenv("browser");
//    String osOption = System.getenv("os");
//    String version = System.getenv("version");
    String platform = System.getProperty("platform");
    String browser = System.getProperty("browser");
    String os = System.getProperty("os");
    String version = System.getProperty("version");
    protected URL url;

    @BeforeMethod
    public void browswerSetup() {
        if(platform.equalsIgnoreCase("local")) {
            try {
                if (browser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                } else if (browser.equalsIgnoreCase("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                } else if (browser.equalsIgnoreCase("edge")) {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                } else {
                    System.out.println("The Browser type is Undefined");
                }
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                driver.get(getBaseUrl());
                driver.manage().window().maximize();
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.doLogin(getEmail(), getPassword());
            } catch (NullPointerException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (platform.equalsIgnoreCase("sauceLab")) {
            cloudConfiguration( "https://" + getSauceLabUserName() +":"+ getSauceLabAccessKey() + getSauceLabUrl());
        } else if (platform.equalsIgnoreCase("lambdaTest")) {
            cloudConfiguration( "https://" + getLambdaTestUserName() +":"+ getLambdaTestAccessKey() + getLambdaURL());
        }
    }

    public void  cloudConfiguration(String testUrl) {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserName", browser);
            caps.setCapability("platform", os);
            caps.setCapability("version", version);
            url = new URL(testUrl);
            driver = new RemoteWebDriver(url, caps);
            driver.get(getBaseUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Closing driver is successful");
        driver.quit();
    }
}

