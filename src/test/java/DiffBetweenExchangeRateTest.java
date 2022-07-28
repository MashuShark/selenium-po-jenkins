import org.testng.Assert;
import org.testng.annotations.Test;

public class DiffBetweenExchangeRateTest extends BaseTest {

    @Test(priority = 1)
    public void verifyThatDiffBetweenInterbankAndCashSellUSDLessOrEqual5() {
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);

        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().interbankButton).click();

        double interbankSellUSD = getFinancePage().getInterbankSellUSD();

        getDriver().findElement(getFinancePage().cashButton).click();

        double cashSellUSD = getFinancePage().getCashSellUSD();

        Assert.assertTrue(Math.abs(cashSellUSD - interbankSellUSD) <= 5,
                "Difference is more then 5");

    }

    @Test(priority = 2)
    public void verifyThatDiffBetweenInterbankAndCashBuyUSDLessOrEqual5() {
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);

        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().interbankButton).click();

        double interbankBuyUSD = getFinancePage().getInterbankBuyUSD();

        getDriver().findElement(getFinancePage().cashButton).click();

        double cashBuyUSD = getFinancePage().getCashBuyUSD();

        Assert.assertTrue(Math.abs(cashBuyUSD - interbankBuyUSD) <= 5,
                "Difference is more then 5");

    }
    @Test (priority = 3)
    public void verifyThatDiffBetweenInterbankAndMoneychangerSellUSDLessOrEqual5(){
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);

        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().interbankButton).click();

        double interbankSellUSD = getFinancePage().getInterbankSellUSD();

        getDriver().findElement(getFinancePage().moneychangerButton).click();

        double moneychangerSellUSD = getFinancePage().getMoneychangerSellUSD();

        Assert.assertTrue(Math.abs(moneychangerSellUSD - interbankSellUSD) <= 5,
                "Difference is more then 5");
    }

    @Test(priority = 4)
    public void verifyThatDiffBetweenInterbankAndMoneychangerBuyUSDLessOrEqual5() {
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);

        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().interbankButton).click();

        double interbankBuyUSD = getFinancePage().getInterbankBuyUSD();

        getDriver().findElement(getFinancePage().moneychangerButton).click();

        double moneychangerBuyUSD = getFinancePage().getMoneychangerBuyUSD();

        Assert.assertTrue(Math.abs(moneychangerBuyUSD - interbankBuyUSD) <= 5,
                "Difference is more then 5");

    }

    @Test(priority = 5)
    public void verifyThatDiffBetweenCashAndMoneychangerSellUSDLessOrEqual5() {
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);
        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().cashButton).click();

        double cashSellUSD = getFinancePage().getCashSellUSD();

        getDriver().findElement(getFinancePage().moneychangerButton).click();

        double moneychangerSellUSD = getFinancePage().getMoneychangerSellUSD();

        Assert.assertTrue(Math.abs(moneychangerSellUSD - cashSellUSD) <= 5,
                "Difference is more then 5");
    }

    @Test(priority = 6)
    public void verifyThatDiffBetweenCashAndMoneychangerBuySDLessOrEqual5() {
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);
        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().cashButton).click();

        double cashBuyUSD = getFinancePage().getCashBuyUSD();

        getDriver().findElement(getFinancePage().moneychangerButton).click();

        double moneychangerBuyUSD = getFinancePage().getMoneychangerBuyUSD();

        Assert.assertTrue(Math.abs(moneychangerBuyUSD - cashBuyUSD) <= 5,
                "Difference is more then 5");
    }
}