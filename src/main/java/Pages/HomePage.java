package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.List;


public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "label.tab-label-2.wow")
    WebElement itemsTab;

    @FindBy(linkText = "Edit")
    WebElement editButton;

    @FindBy(css = "div.left-itemcontainer")
    List <WebElement> itemContainer;


    public void clickOnItemTab () {
        itemsTab.click();
    }

    public void selectItem(String name) {
        for (WebElement item:itemContainer)
        {
            String itemSearchedFor=item.getText();
            if (itemSearchedFor==name)
                break;;
        }
    }
    public void clickOnEditButton() {
        editButton.click();
    }

}
