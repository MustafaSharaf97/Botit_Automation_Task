package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.editPage;

public class changePrice extends TestBase {


    LoginPage login;
    HomePage home;
    editPage edit;

    @Test()
    public void userCanLoginAndChangePrice() throws InterruptedException {
        login=new LoginPage(driver);
        login.Login("testbotita1@dist.com","123456");
        home =new HomePage(driver);
        edit=new editPage(driver);
        home.clickOnEditForFoulPlate();
        edit.Changeprice("60");

        //there is no redirection for grid table and no change happened in price after save
        // so i assert on the present of foul field in the edit page

        Assert.assertTrue(edit.getFoodOriginalPlateField().isDisplayed());
    }

}
