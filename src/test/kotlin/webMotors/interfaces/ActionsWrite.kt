package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By

interface ActionsWrite {

    /**
     * Write the requested text
     * @param [element: By] Page element
     * @param [text: String] Requested text
     * @exception RuntimeException It was not possible to write in the requested field!
     */
    fun write(element: By, text: String) {
        try {
            driver.findElement(element).sendKeys(text)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to write in the requested field!", e)
        }
    }
}