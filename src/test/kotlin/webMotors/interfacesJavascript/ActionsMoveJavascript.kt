package webMotors.interfacesJavascript

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

interface ActionsMoveJavascript {

    fun moveToTheJavascript(element: By?) {
        val webElement: WebElement = driver.findElement(element)
        val executor = driver as JavascriptExecutor
        executor.executeScript("arguments[0].scrollIntoView(true);", webElement)
    }

    fun scrollDownJavascript(quantity: Int) {
        val jse = driver as JavascriptExecutor
        jse.executeScript("window.scrollBy(0, $quantity)")
    }

    fun scrollUpJavascript(quantity: Int) {
        val jse = driver as JavascriptExecutor
        jse.executeScript("window.scrollBy(0, $quantity)")
    }
}