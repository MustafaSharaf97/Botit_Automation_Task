package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class editPage extends PageBase {
    public editPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "mainPrice")
    WebElement priceField;

    @FindBy(css = "div.title-have-size")
    WebElement itemVariationsSections;

    @FindBy(css = "input.exit-button")
    WebElement saveAndexitButton;

    public void Changeprice(String price) {
        Actions action =new Actions(driver);
        action.scrollToElement(itemVariationsSections);
        priceField.clear();
        priceField.sendKeys(price);
        saveAndexitButton.click();

    }
}
