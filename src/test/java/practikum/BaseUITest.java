package practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

public abstract class BaseUITest {
   public static WebDriver webDriver;

    @BeforeClass
    public static void setup() {
//        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
//        webDriver = new FirefoxDriver();
        webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void clearData(){
        webDriver.manage().deleteAllCookies();
        ((WebStorage)webDriver).getSessionStorage().clear();
        ((WebStorage)webDriver).getLocalStorage().clear();

    }

    @AfterClass
    public static void tearDown(){
        webDriver.quit();
    }
}
