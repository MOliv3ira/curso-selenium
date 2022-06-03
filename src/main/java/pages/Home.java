package pages;

import org.openqa.selenium.By;
import support.driver.DriverManager;

public class Home extends DriverManager {

    public void acessarAplicacao() {
    getDriver().get(configuration.url());
    }
}
