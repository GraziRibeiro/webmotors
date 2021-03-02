package webMotors.interfaces

import webMotors.driver.DriverManager.driver

interface ActionsFrame {

    /**
     * Enter the <Frame> element of the page.
     * @exception RuntimeException It was not possible to enter the requested frame!
     */
    fun enterFrame() {
        try {
            driver.switchTo().alert()
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to enter the requested frame!", e)
        }
    }

    /**
     * Leaves the <Frame> element of the page.
     * @exception RuntimeException It was not possible to return to the standard structure!
     */
    fun leaveFrame() {
        try {
            driver.switchTo().defaultContent()
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to return to the standard structure!", e)
        }
    }
}