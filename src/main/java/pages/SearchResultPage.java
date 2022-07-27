package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{

    public By financeLink = By.xpath( "//a[@href='https://finance.ua/']");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
}
