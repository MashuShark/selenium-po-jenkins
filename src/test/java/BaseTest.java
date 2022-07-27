import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.FinancePage;
import pages.HomePage;
import pages.SearchResultPage;

public class BaseTest {
    private WebDriver driver;

    public final boolean HOLD_BROWSER_OPEN = true;
    private static final String GOOGLE_URL = "https://www.google.com.ua";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void profileSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GOOGLE_URL);
    }

    @AfterMethod
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public FinancePage getFinancePage() {
        return new FinancePage(getDriver());
    }
}