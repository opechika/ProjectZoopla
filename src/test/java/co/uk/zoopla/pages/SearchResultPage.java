package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    private WebElement title;
    @FindBy(css = ".listing-results-price.text-price")
    private List<WebElement> results;

    public void isSearchResultDisplayed(String propertyType, String location)
    {
        String titleText = title.getText();
        Assert.assertTrue(titleText.contains(propertyType));
        Assert.assertTrue(titleText.contains(location));
    }

    public void isResultListDisplayed()
    {
        Assert.assertTrue(results.size() > 0);
    }

    public ProductDetailsPage clickOnAnyResultsLink()
    {
        //results.get(5).click();

        Random random = new Random();
        int result = random.nextInt(results.size()-1);
        results.get(result).click();
        return new ProductDetailsPage(driver);
    }
}
