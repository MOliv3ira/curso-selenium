

package support.driver;

import lombok.extern.log4j.Log4j2;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import support.config.Configuration;
import support.driver.local.LocalDriverManager;
import support.driver.remote.RemoteDriverManager;

@Log4j2
public class DriverFactory {


    public static WebDriver createInstance(String browser) {
        Configuration configuration = ConfigCache.getOrCreate(Configuration.class);
        Target target = Target.valueOf(configuration.target().toUpperCase());
        WebDriver webdriver;

        switch (target) {

            case LOCAL:
                webdriver = new LocalDriverManager().createInstance(browser);
                break;
            case GRID:
                webdriver = new RemoteDriverManager().createInstance(browser);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + target);
        }
        return webdriver;
    }

    enum Target {
        LOCAL, GRID
    }
}
