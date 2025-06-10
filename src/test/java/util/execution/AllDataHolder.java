package util.execution;

import com.demoq.Initializer.ConfigInitializer;
import pageobjects.Demo;

/**
 * @author G Ganesh
 */
public class AllDataHolder {

    private static String browser ;
    static String exelPath;
    static String browserVersion;
    private static Demo demo;

    static {
        try {
            ConfigInitializer.setConfigProperties();
        }catch (Exception e){
            e.printStackTrace();
        }
        setDemo(new Demo());

    }
    public String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        AllDataHolder.browser = browser;
    }

    public static String getExelPath() {
        return exelPath;
    }

    public static void setExelPath(String exelPath) {
        AllDataHolder.exelPath = exelPath;
    }

    public static String getBrowserVersion() {
        return browserVersion;
    }

    public static void setBrowserVersion(String browserVersion) {
        AllDataHolder.browserVersion = browserVersion;
    }

    public static Demo getDemo() {
        return demo;
    }

    public static void setDemo(Demo demo) {
        AllDataHolder.demo = demo;
    }
}
