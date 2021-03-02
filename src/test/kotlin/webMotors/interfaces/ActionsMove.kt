package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions

interface ActionsMove {

    /**
     * Moves to the desired element.
     * @param [element: By] Desired element
     * @return String
     * @exception RuntimeException It was not possible to move to the requested element!
     */
    fun moveToTheElement(element: By?) {
        try {
            val action = Actions(driver)
            action.moveToElement(driver.findElement(element)).build().perform()
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to move to the requested element!", e)
        }
    }
}