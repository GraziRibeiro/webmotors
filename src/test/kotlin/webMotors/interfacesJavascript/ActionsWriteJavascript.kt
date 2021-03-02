package webMotors.interfacesJavascript

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

interface ActionsWriteJavascript {

    fun writeJavascript(element: By?, text: String) {
        val webElement: WebElement = driver.findElement(element)
        val executor = driver as JavascriptExecutor
        executor.executeScript("arguments[0].value=$text;", webElement)
    }
}