package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class PageTwo extends DriverManager {


    private By btnEntrar = By.id("entrar");
    private By inputSenha = By.id("password");
    private By inputEmail = By.id("username");
    private By lblNotice = By.xpath("//*[@id='statusTeste']");

    public void clickEntrar() {
        Action.getVisibleElement(btnEntrar);
        getDriver().findElement(btnEntrar).click();
    }

    public void fillfield(String field, String value) {
        switch (field){
            case "email": fillEmail(value); break;
            case "senha": fillSenha(value); break;
        }
    }

    private void fillSenha(String value) {
        Action.getVisibleElement(inputSenha);
        getDriver().findElement(inputSenha).sendKeys(value);
    }

    private void fillEmail(String value) {
        Action.getVisibleElement(inputEmail);
        getDriver().findElement(inputEmail).sendKeys(value);
    }

    public String getNotice() {
        Action.getVisibleElement(lblNotice);
        return getDriver().findElement(lblNotice).getText();
    }
}
