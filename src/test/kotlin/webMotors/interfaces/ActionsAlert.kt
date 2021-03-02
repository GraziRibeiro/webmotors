package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.Alert

interface ActionsAlert {

    /**
     * Accepts the alert message.
     * @exception RuntimeException Could not accept the alert!
     */
    fun acceptAlert() {
        try {
            val alert: Alert = driver.switchTo().alert()
            alert.accept()
        } catch (e: RuntimeException) {
            throw RuntimeException("Could not accept the alert!", e)
        }
    }

    /**
     * Get the alert text.
     * @return String
     * @exception RuntimeException Could not get the alert text!
     */
    fun getAlertText(): String {
        val text: String
        text = try {
            val alert: Alert = driver.switchTo().alert()
            alert.text
        } catch (e: RuntimeException) {
            throw RuntimeException("Could not get the alert text!", e)
        }
        return text
    }

    /**
     * Reject the alert message.
     * @exception RuntimeException The alert could not be rejected!
     */
    fun dismissAlert() {
        try {
            val alert: Alert = driver.switchTo().alert()
            alert.dismiss()
        } catch (e: RuntimeException) {
            throw RuntimeException("The alert could not be rejected!", e)
        }
    }

    /**
     * Type in the text box available in the alert.
     * @param [text: String] Desired text
     * @exception RuntimeException The alert could not be written!
     */
    fun writeInAlert(text: String) {
        try {
            val alert: Alert = driver.switchTo().alert()
            alert.sendKeys(text)
        } catch (e: RuntimeException) {
            throw RuntimeException("The alert could not be written!", e)
        }
    }
}