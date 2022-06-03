package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Action;
import support.driver.DriverManager;

import java.util.List;


public class PageThree extends DriverManager {


    private By inputCheck = By.xpath("//*[@id='check[]']");
    private By btnComprar = By.xpath("//*[@id='desafio']//button");
    private By lblNotice = By.xpath("//*[@id='statusTeste']");

    public void allCheckbox() {
        Action.getVisibleElement(inputCheck);
        List<WebElement> element = getDriver().findElements(By.xpath("//input[@id='check[]']"));

        for (WebElement i: element) {
            if (!i.isSelected()){
                i.click();
            }
        }
    }

    public void clickComprar() {
        Action.getVisibleElement(btnComprar);
        getDriver().findElement(btnComprar).click();
    }

    public String getNotice() {
        Action.getVisibleElement(lblNotice);
        return getDriver().findElement(lblNotice).getText();
    }
}
