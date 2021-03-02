package webMotors.interfaces

import webMotors.driver.DriverManager.driver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

interface ActionsSelect {

    /**
     * Select an option from a <Select> by visible text.
     * @param [element: By] Desired element
     * @param [value: String] Text of option
     * @exception RuntimeException It was not possible to select option by text!
     */
    fun selectOptionByVisibleText(element: By, value: String) {
        try {
            val webElement: WebElement = driver.findElement(element)
            val select = Select(webElement)
            select.selectByVisibleText(value)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to select option by text!", e)
        }
    }

    /**
     * Select an option from a <Select> by position.
     * @param [element: By] Desired element
     * @param [position: Int] Position of option
     * @exception RuntimeException It was not possible to select option by position!
     */
    fun selectOptionByIndex(element: By, position: Int) {
        try {
            val webElement: WebElement = driver.findElement(element)
            val select = Select(webElement)
            select.selectByIndex(position)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to select option by position!", e)
        }
    }

    /**
     * Selects the first position of a <Select>
     * @param [element: By] Desired element
     * @return String
     * @exception RuntimeException Could not get the text of the first position of the Select!
     */
    fun getTextFirstPosition(element: By): String {
        val select: Select
        select = try {
            val webElement: WebElement = driver.findElement(element)
            Select(webElement)
        } catch (e: RuntimeException) {
            throw RuntimeException("Could not get the text of the first position of the Select!", e)
        }
        return select.firstSelectedOption.text
    }

    /**
     * Deselect a <Select> option for visible text
     * @param [element: By] Desired element
     * @param [value: String] Visible text
     * @exception RuntimeException It was not possible to deselect the combo!
     */
    fun deselectOptionByVisibleText(element: By, value: String) {
        try {
            val webElement: WebElement = driver.findElement(element)
            val combo = Select(webElement)
            combo.deselectByVisibleText(value)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to deselect the combo!", e)
        }
    }
}