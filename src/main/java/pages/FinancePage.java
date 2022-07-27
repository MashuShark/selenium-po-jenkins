package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FinancePage extends BasePage{

    public By interbankButton = By.xpath("//span[contains(text(),'Міжбанк')]");
    public By cashButton = By.xpath("//span[contains(text(),'Гот')]");
    public By moneychangerButton = By.xpath("//span[contains(text(),'Міняйло')]");

    public List<WebElement> interbankUSDList = driver.findElements(
            By.xpath("//a[@data-gtm-ea='interbank-$-button']//span[@class='fua-xrates__value']")
    );

    public List<WebElement> cashUSDList = driver.findElements(
            By.xpath("//a[@data-gtm-ea='cash-$-button']//span[@class='fua-xrates__value']")
    );

    public FinancePage(WebDriver driver) {
        super(driver);
    }

    public double getInterbankSellUSD(){
        return Double.parseDouble(
               interbankUSDList.get(0).getText().split("\n")[0]
        );
    }
    public double getInterbankBuyUSD(){
        return Double.parseDouble(
                interbankUSDList.get(1).getText().split("\n")[0]
        );
    }

    public double getCashSellUSD(){
        return Double.parseDouble(
                cashUSDList.get(0).getText().split("\n")[0]
        );
    }
    public double getCashBuyUSD(){
        return Double.parseDouble(
                cashUSDList.get(1).getText().split("\n")[0]
        );
    }
}