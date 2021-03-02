package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By

interface ActionsGet {

    /**
     * Get the text of the desired element.
     * @param [element: By] Desired element
     * @return String
     * @exception RuntimeException It was not possible to get the text of the requested field!
     */
    fun getText(element: By): String {
        return try {
            val text: String = driver.findElement(element).text
            text
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to get the text of the requested field!", e)
        }
    }

    /**
     * Get the attribute value of an element.
     * @param [element: By] Desired element
     * @return String
     * @exception RuntimeException Could not get the requested attribute value!
     */
    fun getValueOfElementAttribute(element: By): String {
        return try {
            val text: String = driver.findElement(element).getAttribute("value")
            text
        } catch (e: RuntimeException) {
            throw RuntimeException("Could not get the requested attribute value!", e)
        }
    }
}