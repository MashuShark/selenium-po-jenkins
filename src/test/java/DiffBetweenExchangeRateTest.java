import org.testng.Assert;
import org.testng.annotations.Test;

public class DiffBetweenExchangeRateTest extends BaseTest {

    @Test
    public void verifyThatDiffBetweenInterbankAndCashSellUSDLessOrEqual5() {
        getHomePage().searchQuery(getHomePage().searchInput, getHomePage().SEARCH_FINANCE);

        getDriver().findElement(getSearchResultPage().financeLink).click();
        getDriver().findElement(getFinancePage().interbankButton).click();

        double interbankSellUSD = getFinancePage().getInterbankSellUSD();

        getDriver().findElement(getFinancePage().cashButton).click();

        double cashSellUSD = getFinancePage().getCashSellUSD();

        Assert.assertTrue(cashSellUSD - interbankSellUSD <= 5,
                "Difference is more then 5");

    }
}