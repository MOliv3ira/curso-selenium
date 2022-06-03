package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class PageOne extends DriverManager {


    private By btnIniciar = By.xpath("//*[@id='botoes']//button");
    private By inputTexto = By.xpath("//*[@id='testeTexto']");
    private By btnEnviar = By.xpath("//*[@id='enviarMsg']");
    private By lblNotice = By.xpath("//*[@id='statusTeste']");
    private By btnValidar = By.xpath("//*[@id='submeter']//button");

    public void clickIniciar() {
        Action.getVisibleElement(btnIniciar);
        getDriver().findElement(btnIniciar).click();
    }

    public void fillfield(String field, String value) {
        switch (field){
            case "texto": fillTexto(value); break;
        }
    }

    private void fillTexto(String value) {
        Action.getVisibleElement(inputTexto);
        getDriver().findElement(inputTexto).sendKeys(value);
    }

    public void clickEnviarMensagem() {
        Action.getVisibleElement(btnEnviar);
        getDriver().findElement(btnEnviar).click();
    }

    public String getNotice() {
        Action.getVisibleElement(lblNotice);
        return getDriver().findElement(lblNotice).getText();
    }

    public void clickValidar() {
        Action.getVisibleElement(btnValidar);
        getDriver().findElement(btnValidar).click();
    }
}
