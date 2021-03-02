package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.junit.Assert
import org.openqa.selenium.By

interface ActionsValidation : ActionsGet {

    /**
     * Validates if an element is visible
     * @param [element: By] Desired element
     * @exception RuntimeException It was not possible to validate if the element is visible!
     */
    fun validateIfElementThisVisible(element: By) {
        try {
            Assert.assertTrue(driver.findElement(element).isDisplayed)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to validate if the element is visible!", e)
        }
    }

    /**
     * Validates that messages are the same
     * @param [element: By] Desired element
     * @exception RuntimeException The strings are different
     */
    fun validateText(element: By) {
        val messageToBeAsserted = getText(element)
        try {
            Assert.assertEquals(messageToBeAsserted, getText(element))
        } catch (e: RuntimeException) {
            println(messageToBeAsserted)
            println(getText(element))
            throw RuntimeException("The strings are different", e)
        }
    }

    /**
     * Validates whether an element is enabled
     * @param [element: By] Desired element
     * @exception RuntimeException It was not possible to validate if the element is enabled!
     */
    fun validateIfElementThisEnabled(element: By) {
        try {
            Assert.assertTrue(driver.findElement(element).isEnabled)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to validate if the element is enabled!", e)
        }
    }

    /**
     * Validates the title of the browser window
     * @param [tabTitle: String] Desired title
     * @exception RuntimeException The browser title could not be validated!
     */
    fun validateBrowserTitle(tabTitle: String) {
        try {
            Assert.assertEquals(tabTitle, driver.title)
        } catch (e: RuntimeException) {
            throw RuntimeException("The browser title could not be validated!", e)
        }
    }

    /**
     * Validates the current URL
     * @param [url: String] Desired title
     * @exception RuntimeException The current URL could not be validated!
     */
    fun validateUrlCurrent(url: String) {
        try {
            Assert.assertEquals(url, driver.currentUrl)
        } catch (e: RuntimeException) {
            throw RuntimeException("The current URL could not be validated!", e)
        }
    }

    /**
     * Validates that an element is selected
     * @param [element: By] Desired element
     * @return Boolean
     * @exception RuntimeException It was not possible to validate that the element is selected!
     */
    fun validateElementIsSelected(element: By): Boolean {
        return try {
            driver.findElement(element).isSelected
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to validate that the element is selected!", e)
        }
    }
}