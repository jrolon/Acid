package utilities;

import java.io.*;
import java.util.Properties;

import static utilities.LoggerHandler.logType.ERROR;
import static utilities.LoggerHandler.registerInfo;
import static utilities.constants.GeneralConstants.CONSTANT_CLASS;

public class PropertiesHandler {

    /**
     * Description: Load a .properties file according to the path sent
     * Date: 19/05/2023
     *
     * @author danielazuluaga
     * ChangeLog:
     */
    public static Properties loadProperties(String propertiesPath) {
        Properties properties = new Properties();
        try (FileInputStream stream = new FileInputStream(propertiesPath)) {
            properties.load(stream);
        } catch (IOException e) {
            registerInfo(PropertiesHandler.class, ERROR, "Properties file could not be loaded");
        }
        return properties;
    }

    private PropertiesHandler() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}
