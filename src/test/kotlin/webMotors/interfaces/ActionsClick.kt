package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By

interface ActionsClick {

    /**
     * Performs a click on the element.
     * @param [element: By] Page element
     * @exception RuntimeException Could not click on the element!
     */
    fun click(element: By) {
        try {
            driver.findElement(element).click()
        } catch (e: RuntimeException) {
            throw RuntimeException("Could not click on the element!", e)
        }
    }
}