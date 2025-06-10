package com.demoq.Initializer;


import com.demoq.Constants.DriverConstants;
import org.slf4j.LoggerFactory;
import util.execution.AllDataHolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;



/**
 * @author G Ganesh
 */
public class ConfigInitializer implements DriverConstants {

    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(ConfigInitializer.class);
    public static final Properties prop = new Properties();



    public static void setConfigProperties() throws IOException {
       getProp().load(new FileInputStream(new File(CONFIGPATH).getAbsolutePath()));
       AllDataHolder.setBrowser(Optional.ofNullable(System.getenv(BROWSER)).orElse(prop.getProperty(BROWSER)));
        AllDataHolder.getDemo().test();

    }

    @SuppressWarnings("SameReturnValue")
    public static Properties getProp(){
        return prop;
    }



}
