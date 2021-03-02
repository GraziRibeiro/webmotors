package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

interface ActionsWait {

    /**
     * Waits for the requested time until an element is clickable
     * @param [element: By] Desired element
     * @param [waitingTime: Long] Waiting time
     * @exception RuntimeException The requested action could not be performed!
     */
    fun waitForElementToBeClickable(element: By, waitingTime: Long) {
        try {
            val wait = WebDriverWait(driver, waitingTime)
            wait.until(ExpectedConditions.elementToBeClickable(element))
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested action could not be performed!", e)
        }
    }

    /**
     * Waits for the requested time until an element is selectable
     * @param [element: By] Desired element
     * @param [waitingTime: Long] Waiting time
     * @exception RuntimeException The requested action could not be performed!
     */
    fun waitForElementToBeSelectable(element: By, waitingTime: Long) {
        try {
            val wait = WebDriverWait(driver, waitingTime)
            wait.until(ExpectedConditions.elementToBeSelected(element))
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested action could not be performed!", e)
        }
    }

    /**
     * Waits for the requested time until an element is loaded
     * @param [url: String] Desired element
     * @param [waitingTime: Long] Waiting time
     * @exception RuntimeException The requested action could not be performed!
     */
    fun waitForUrlToBeLoaded(url: String, waitingTime: Long) {
        try {
            val wait = WebDriverWait(driver, waitingTime)
            wait.until(ExpectedConditions.urlToBe(url))
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested action could not be performed!", e)
        }
    }

    /**
     * Waits for the requested time until an element is visible
     * @param [element: By] Desired element
     * @param [waitingTime: Long] Waiting time
     * @exception RuntimeException The requested action could not be performed!
     */
    fun waitingElementToBeVisible(element: By, waitingTime: Long) {
        try {
            val wait = WebDriverWait(driver, waitingTime)
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)))
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested action could not be performed!", e)
        }
    }

    /**
     * Waits for the requested time
     * @param [waitingTime: Long] Waiting time
     * @exception RuntimeException The requested action could not be performed!
     */
    fun sleep(waitingTime: Long) {
        try {
            Thread.sleep(waitingTime)
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested action could not be performed!", e)
        }
    }
}