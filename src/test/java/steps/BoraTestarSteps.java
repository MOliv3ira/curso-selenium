package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;

public class BoraTestarSteps {

    private Home home = new Home();
    private HomeMenu homeMenu = new HomeMenu();
    private PageOne pageOne = new PageOne();
    private PageTwo pageTwo = new PageTwo();
    private PageThree pageThree = new PageThree();
    private PageFour pageFour = new PageFour();
    private PageFive pageFive = new PageFive();

    @Dado("que o usuario esta no sistema Bora Testar")
    public void queOUsuarioEstaNoSistemaBoraTestar() {
        home.acessarAplicacao();
    }

    @Quando("o usuario escolhe o menu Iniciante")
    public void oUsuarioEscolheOMenuIniciante() throws InterruptedException {
//        Thread.sleep(5000);
        homeMenu.clickMenuIniciante();
    }

    @E("o usuario clica em Iniciar")
    public void oUsuarioClicaEmIniciar() {
        pageOne.clickIniciar();
    }

    @E("o usuario preenche o campo {string} com {string}")
    public void oUsuarioPreencheOCampoCom(String field, String value) {
        pageOne.fillfield(field, value);
    }

    @E("o usuario clica em enviar mensagem")
    public void oUsuarioClicaEmEnviarMensagem() {
        pageOne.clickEnviarMensagem();
    }

    @E("o usuário deveria ver a mensagem {string}")
    public void oUsuárioDeveriaVerAMensagem(String message) {
        Assert.assertEquals(message, pageOne.getNotice());
    }

    @Entao("o usuario clica em validar")
    public void oUsuarioClicaEmValidar() throws InterruptedException {
        Thread.sleep(5000);
        pageOne.clickValidar();
    }

    @E("o usuario preenche o campo {string} com {string} no teste dois")
    public void oUsuarioPreencheOCampoComNoTesteDois(String field, String value) {
        pageTwo.fillfield(field, value);
    }

    @E("o usuario clica em Entrar")
    public void oUsuarioClicaEmEntrar() {
        pageTwo.clickEntrar();
    }

    @E("o usuário deveria ver a mensagem {string} no teste dois")
    public void oUsuárioDeveriaVerAMensagemNoTesteDois(String message) {
        Assert.assertEquals(message, pageTwo.getNotice());
    }

    @E("o usuario deve marcar todos os items da lista")
    public void oUsuarioDeveMarcarTodosOsItemsDaLista() {
        pageThree.allCheckbox();
    }

    @E("o usuario clica em Comprar")
    public void oUsuarioClicaEmComprar() {
        pageThree.clickComprar();

    }

    @E("o usuário deveria ver a mensagem {string} no teste três")
    public void oUsuárioDeveriaVerAMensagemNoTesteTres(String message) {
        Assert.assertEquals(message, pageThree.getNotice());
    }

    @E("seleciona uma ferramenta disponivel no menu")
    public void selecionaUmaFerramentaDisponivelNoMenu() {
        pageFour.clickFerramenta();
    }

    @E("o usuário deveria ver a mensagem {string} no teste quatro")
    public void oUsuárioDeveriaVerAMensagemNoTesteQuatro(String message) {
        Assert.assertEquals(message, pageFour.notice());
    }

    @E("o usuario clica em gerar numero")
    public void oUsuarioClicaEmGerarNumero() {
        pageFive.clickGerarNumero();
    }

    @E("usuario confirma se numero é par")
    public void usuarioConfirmaSeNumeroEPar() {
        pageFive.confirmaNumero();
    }

    @E("o usuário deveria ver a mensagem {string} no teste cinco")
    public void oUsuárioDeveriaVerAMensagemNoTesteCinco(String message) {
        Assert.assertEquals(message, pageFive.notice());
    }
}
