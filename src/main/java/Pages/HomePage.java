package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "label.tab-label-2.wow")
    WebElement itemsTab;

    @FindBy(linkText = "Edit")
    List<WebElement> editButton;


    public void clickOnEditForFoulPlate ()  {
        itemsTab.click();
        editButton.get(2).click();
    }
}
