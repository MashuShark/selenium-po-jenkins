package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    public final String SEARCH_FINANCE = "https://finance.ua";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


//    public void waitElementIsVisible(WebElement element) {
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOf(element));
//    }

    public void moveToElement(By by) {
        Actions moveTo = new Actions(driver);
        moveTo.moveToElement(driver.findElement(by));
    }
}
