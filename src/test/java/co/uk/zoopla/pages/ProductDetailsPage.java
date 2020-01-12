package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage
{
    public ProductDetailsPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


}
