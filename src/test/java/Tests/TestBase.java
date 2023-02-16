package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class TestBase {
    public static WebDriver driver;

    @BeforeTest
    public void startDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://transmission-dev.azurewebsites.net/login");
    }

    @AfterTest
    public void StopDriver()
    {
        driver.quit();
    }
}
