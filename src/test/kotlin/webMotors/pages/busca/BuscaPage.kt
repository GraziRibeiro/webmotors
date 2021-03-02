package webMotors.pages.busca

import org.openqa.selenium.By

class BuscaPage {

    private val urlQa = "https://www.webmotors.com.br"
    private val placeHolder = By.id("searchBar")
    private val buttonOferta = By.xpath ("//div[1]/div[2]/div/div/a[text()='Ver Ofertas']")
    private val filterResult = By.xpath ( "//div[3]/h1[text()='Honda Novos e Usados']")
    private val logoHome = By.id("logoHomeWebmotors")
    private val cardMake = By.xpath("//a[4]")
    private val todosModelos = By.xpath("//div[2]/div[2]/div[2][text()='Todos os modelos']")
    private val filterCity = By.xpath("//div[5]/a[2][text()='CITY']")
    private  val filterVersao = By.xpath("//div[2]/div[3][text()='Todas as versões']")
    private val filterSelecionarVersao = By.xpath("//div[4]/a[5][text()='1.5 EXL 16V FLEX 4P AUTOMÁTICO']")




    fun getUrlQA(): String = urlQa

    fun getplaceHolder(): By = placeHolder

    fun getbuttonOferta(): By = buttonOferta

    fun getfilterResult(): By = filterResult

    fun getlogoHome() : By = logoHome

    fun getcardMake() : By = cardMake

    fun gettodosModelos() : By = todosModelos

    fun getfilterCity () : By = filterCity

    fun getfilterVersao () : By = filterVersao

    fun getfilterSelecionarVersao () : By = filterSelecionarVersao

}