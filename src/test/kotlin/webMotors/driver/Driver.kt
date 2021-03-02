package webMotors.driver

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

object DriverManager {
    private val mustRunHeadless = System.getenv().getOrDefault("RUN_BROWSER_IN_HEADLESS_MODE", "false").toBoolean()
    private val webDriverPath =
        System.getenv().getOrDefault("WEBDRIVER_PATH", "src/test/resources/drivers/chromedriver.exe")

    val driver = ChromeOptions().let {
        if (mustRunHeadless) {
            it.setHeadless(mustRunHeadless)
            it.addArguments("--no-sandbox")
        }
        System.setProperty("webdriver.chrome.driver", webDriverPath)
        val driverWeb = ChromeDriver(it)
        driverWeb.manage().window().maximize()
        driverWeb
    }
}