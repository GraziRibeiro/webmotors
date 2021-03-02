package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By

interface ActionsClear {

    /**
     * Clear field information.
     * @param [element: By] Desired element.
     * @exception RuntimeException The requested field could not be cleared!
     */
    fun clear(element: By) {
        try {
            driver.findElement(element).clear()
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested field could not be cleared!", e)
        }
    }
}