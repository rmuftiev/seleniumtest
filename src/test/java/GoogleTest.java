import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

    @Test

    public void testGoogle () {
        String baseUrl = "https://www.google.com/";


        WebDriver driver = new HtmlUnitDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        String URL= driver.getCurrentUrl();

        String title = driver.getTitle();

        String completeSourceCode = driver.getPageSource();

        driver.close(); //Closed opened window
        //   driver.quit(); closes all opened window
    }


}
