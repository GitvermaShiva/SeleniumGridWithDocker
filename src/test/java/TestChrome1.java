import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestChrome1 {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("chrome");

        URL hubURL=new URL("http://localhost:4444/");

        RemoteWebDriver driver=new RemoteWebDriver(hubURL,cap);

        driver.get("https://www.google.com/");

        System.out.println("Title is: "+driver.getTitle());

        driver.quit();
    }
}
