package webMotors.tests.busca

import io.cucumber.java.pt.*
import webMotors.interacoes.ActionsWeb
import webMotors.pages.busca.BuscaPage
import java.awt.event.KeyEvent
import java.awt.Robot


class BuscaTest {

    private val web: ActionsWeb = ActionsWeb()
    private val buscaPage = BuscaPage()
    private val bot = Robot()


    fun paginaInicial() {
        web.navigateToUrl(buscaPage.getUrlQA())
    }

    @Dado("^que estou na tela inicial do sistema$")
    fun paginaInicialMotors() {
        paginaInicial()
    }

    @Quando("preencho o campo <Busca>$")

    fun preenchoCampoBusca()
    {
        web.waitForElementToBeClickable(buscaPage.getplaceHolder(), 90);
        web.write(buscaPage.getplaceHolder(), "Honda")
    }

    @E("^clico na <Opcao>$")
    fun clicoNaOpcao()
    {
        web.sleep(2000)
        web.click(buscaPage.getplaceHolder())
        web.sleep(2000)
        bot.keyPress(KeyEvent.VK_DOWN)
        bot.keyPress(KeyEvent.VK_ENTER)
    }
    @Então ("^volto para home$")
    fun voltoHome()
    {
        web.sleep(2000)
        web.click (buscaPage.getlogoHome())

    }
    //-------------------Validar Marca------------------

    @Quando("^clico no botao <Ver Ofertas>$")
    fun clicoBotaoOfertas()
    {
        web.sleep(2000)
        web.click(buscaPage.getbuttonOferta())
        web.sleep(2000)
    }

    @E("^clico no Botão <Honda>$")
    fun clicoNaOpcaoHonda() {
        web.sleep(2000)
        web.click(buscaPage.getcardMake())
        web.sleep(2000)
    }
    @E("^clico no botao <Todos os modelos>$")
    fun clicoButtonModelo()
    {
        web.sleep(2000)
        web.click(buscaPage.gettodosModelos())
    }

    @E("^clico no modelo <CITY>$")
    fun buttonModelo()
    {
        web.sleep(2000)
        web.click(buscaPage.getfilterCity())
        web.sleep(2000)
    }

    @E("^clico no botao <Todas as versoes>$")
    fun buttonVersoes()
    {
        web.sleep(2000)
        web.click(buscaPage.getfilterVersao())
    }
    @E("^seleciono uma versao$")
    fun selecionoVersao()
    {

        web.sleep(2000)
        web.click(buscaPage.getfilterSelecionarVersao())
        web.sleep(2000)

    }


}