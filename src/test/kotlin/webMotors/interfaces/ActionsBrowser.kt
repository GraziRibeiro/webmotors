package webMotors.interfaces

import webMotors.driver.DriverManager.driver

interface ActionsBrowser {

    /**
     * Opens the desired URL in a new window.
     * @param [url: String] Desired url.
     * @exception RuntimeException The requested URL could not be opened!
     */
    fun openUrl(url: String) {
        try {
            driver.get(url)
        } catch (e: RuntimeException) {
            throw RuntimeException("The requested URL could not be opened!", e)
        }
    }

    /**
     * Navigate to the desired URL.
     * @param [url: String] Desired url.
     * @exception RuntimeException We were unable to navigate to the requested URL!
     */
    fun navigateToUrl(url: String) {
        try {
            driver.navigate().to(url)
        } catch (e: RuntimeException) {
            throw RuntimeException("We were unable to navigate to the requested URL!", e)
        }
    }

    /**
     * Switches the window to the requested window.
     * @param [element: String] Desired window.
     * @exception RuntimeException It was not possible to change windows!
     */
    fun switchWindow(element: String) {
        try {
            driver.switchTo().window(element)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to change windows!", e)
        }
    }

    /**
     * Switch to the desired tab.
     * @param [numberTab: Int] Desired tab.
     * @exception RuntimeException It was not possible to change tabs!
     */
    fun changeTab(numberTab: Int) {
        try {
            driver.switchTo().window(driver.windowHandles.toList()[numberTab] as String)
        } catch (e: RuntimeException) {
            throw RuntimeException("It was not possible to change tabs!", e)
        }
    }

    /**
     * Reloads the current page.
     * @exception RuntimeException The page could not be reloaded!
     */
    fun reloadPage() {
        try {
            driver.navigate().refresh()
        } catch (e: RuntimeException) {
            throw RuntimeException("The page could not be reloaded!", e)
        }
    }

    /**
     * Get the current URL.
     * @exception RuntimeException The browser URL could not be captured!
     */
    fun getUrl(): String {
        return try {
            driver.currentUrl
        } catch (e: RuntimeException) {
            throw RuntimeException("The browser URL could not be captured!", e)
        }
    }
}