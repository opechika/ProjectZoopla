package co.uk.zoopla.pages;

import co.uk.zoopla.common.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLib
{
    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;

    public void launchUrl()
    {
        driver.navigate().to(BASE_URL);
    }

    public void selectElementByVisibleText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectElementByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }

    public void selectElementByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }
}
