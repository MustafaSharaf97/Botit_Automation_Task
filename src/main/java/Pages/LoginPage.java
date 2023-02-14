package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "email")
    WebElement enterYourEmailField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(css = "input.button-input.newd")
    WebElement loginButton;



    public void Login (String username,String password)
    {
        enterYourEmailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
