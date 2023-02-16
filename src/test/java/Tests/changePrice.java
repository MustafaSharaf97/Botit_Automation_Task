package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.editPage;

import java.io.File;
import java.io.IOException;

public class changePrice extends TestBase {


    LoginPage login;
    HomePage home;
    editPage edit;

    @Test()
    public void userCanLoginAndChangePrice() throws  IOException {

        login=new LoginPage(driver);
        login.Login("testbotitc3@dist.com","123456");
        login.takeScreenshot("Screenshotslogin");
        home =new HomePage(driver);
        edit=new editPage(driver);
        home.clickOnItemTab();
        home.selectItem("Foul Original Plate");
        home.clickOnEditButton();
        edit.takeScreenshot("edit");
        edit.Changeprice("60");
        edit.takeScreenshot("Screenshots");


//        access denied for any action so no redirection and change in the price


    }

}
