package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class PageBase {

    protected WebDriver driver;
    public PageBase (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void takeScreenshot(String fileName) throws IOException {
        File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("D:/Botit/Botit_Automation_Task/Screenshots/"+fileName+".jpg"));
    }

}
