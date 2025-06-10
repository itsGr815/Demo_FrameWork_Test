package com.demoq.Initializer;

import org.openqa.selenium.WebDriver;

/**
 * @author G Ganesh
 */
public abstract class DriverFactory {

    private String browser;


    /*
     * Gets the driver factory
     *
     * @return the driver factory
     */
    public abstract WebDriver getDriverFactory();

    /*
     * Gets the version
     *
     * @return the version
     */
    protected String getVersion(String version){
        //return version.equals(LATEST)?
        return version;
    }



    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
}
