package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class PageFour extends DriverManager {


    private By btnFerramenta = By.xpath("//*[@id='menu']//ul[2]");
    private By btnSelect = By.xpath("//*[@id='menu']//li[2]");
    private By lblnotice = By.xpath("//*[@id='statusTeste']");

    public void clickFerramenta() {
        Action.getVisibleElement(btnFerramenta);
        getDriver().findElement(btnFerramenta).click();
        Action.getVisibleElement(btnSelect);
        getDriver().findElement(btnSelect).click();
    }

    public String notice() {
        Action.getVisibleElement(lblnotice);
        return getDriver().findElement(lblnotice).getText();
    }
}
