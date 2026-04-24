import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestFirefox1 {

    @Test
    public void testFirefox() throws MalformedURLException {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("firefox");

        URL hubURL=new URL("http://localhost:4444/");

        RemoteWebDriver driver=new RemoteWebDriver(hubURL,cap);

        driver.get("https://website-ite.uat-paytm.bank.in/");

        System.out.println("Title is: "+driver.getTitle());

        driver.quit();
    }
}
