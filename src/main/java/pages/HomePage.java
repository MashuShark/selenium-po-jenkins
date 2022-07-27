package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public By searchInput = By.xpath("//input[@name='q']");

    public void searchQuery(By by, String query) {
        driver.findElement(by).sendKeys(query, Keys.ENTER);
    }

}