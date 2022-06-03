package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class HomeMenu extends DriverManager {


    private By lblIniciante = By.xpath("//ul[contains(text(),'INICIANTE')]");

    public void clickMenuIniciante() {
        Action.getVisibleElement(lblIniciante);
        getDriver().findElement(lblIniciante).click();
    }
}
