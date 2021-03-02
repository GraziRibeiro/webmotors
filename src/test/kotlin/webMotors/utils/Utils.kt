package webMotors.utils

import webMotors.driver.DriverManager.driver
import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import java.io.File
import java.io.IOException
import java.util.*

class Utils {

    private val caminho = "src/test/resources/screenshot"

    fun takeScreenshot(nomeFoto: String) {
        val scrFile = (driver as TakesScreenshot).getScreenshotAs(OutputType.FILE)
        try {
            FileUtils.copyFile(scrFile, File("src/test/resources/files/$nomeFoto.png"))
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun getCountryList(locale: Locale?): String? {
        val locales = listOf(*Locale.getISOCountries())
        val rand = Random()
        val countryCode = locales[rand.nextInt(locales.size)]
        val obj = Locale("", countryCode)
        return obj.getDisplayCountry(locale)
    }
}