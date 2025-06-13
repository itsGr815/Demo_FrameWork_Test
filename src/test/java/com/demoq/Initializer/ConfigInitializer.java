package com.demoq.Initializer;


import com.demoq.Constants.DriverConstants;
import com.demoq.Constants.Login;
import com.demoq.util.execution.AllDataHolder;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



/**
 * @author G Ganesh
 */
public class ConfigInitializer implements DriverConstants {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(ConfigInitializer.class);
    public static final Properties prop = new Properties();



    public static void setConfigProperties() throws IOException {
       getProp().load(new FileInputStream(new File(CONFIGPATH).getAbsolutePath()));


       AllDataHolder.setBrowser(getProp().getProperty(DriverConstants.BROWSER));
       AllDataHolder.setUrl(getProp().getProperty(Login.url));
       Logger.debug(AllDataHolder.getBrowser());


    }

    @SuppressWarnings("SameReturnValue")
    public static Properties getProp(){
        return prop;
    }



}
