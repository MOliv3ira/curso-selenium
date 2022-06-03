package pages;

import org.openqa.selenium.By;
import support.Action;
import support.driver.DriverManager;

public class PageFive extends DriverManager {

    private By btnGerarNumero = By.xpath("//*[@id='gerar']");
    private By btnConfirma = By.xpath("//*[@id='confirmar']");
    private By lblnoticePar = By.xpath("//*[contains(text(),'NUMERO PAR!')]");
    private By num = By.id("numeroAleatorio");
    private By btnValidar = By.xpath("//*[@id='submeter']//button");

    public void clickGerarNumero() {
        Action.getVisibleElement(btnGerarNumero);
        getDriver().findElement(btnGerarNumero).click();
    }

    public void confirmaNumero() {
        Action.getVisibleElement(btnConfirma);
        getDriver().findElement(btnConfirma).click();

        for (int i = 0; i < 10; i++){
            int numero = Integer.parseInt(getDriver().findElement(num).getText());
            if (numero % 2 == 0){
                break;
            }

            clickGerarNumero();
            Action.getVisibleElement(btnConfirma);
            getDriver().findElement(btnConfirma).click();
        }
    }

    public String notice() {
        Action.getVisibleElement(lblnoticePar);
        return getDriver().findElement(lblnoticePar).getText();
    }

}
