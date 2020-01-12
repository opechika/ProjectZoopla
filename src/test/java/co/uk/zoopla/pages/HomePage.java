package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="search-input-location")
    private WebElement searchField;
    @FindBy(id = "forsale_price_min")
    private WebElement minPrice;
    @FindBy (name = "price_max")
    private WebElement maxPrice;
    @FindBy(id = "property_type")
    private WebElement propertyType;
    @FindBy(id = "beds_min")
    private WebElement noOfBeds;
    @FindBy(css = ".button.button--primary")
    private WebElement submitButton;

    public void enterLocation(String location)
    {
        searchField.clear();
        searchField.sendKeys(location);
    }

    public void selectMinimumPrice(String miniPrice)
    {
        selectElementByVisibleText(minPrice, miniPrice);
    }

    public void selectMaximumPrice(String maxiPrice)
    {
        selectElementByVisibleText(maxPrice, maxiPrice);
    }
    public void selectPropertyType(String property)
    {
        selectElementByVisibleText(propertyType, property);
    }

    public void selectNoOfBeds(String beds)
    {
        selectElementByVisibleText(noOfBeds, beds);
    }

    public SearchResultPage clickOnSubmitButton()
    {
        submitButton.click();
        return new SearchResultPage(driver);
    }
}
