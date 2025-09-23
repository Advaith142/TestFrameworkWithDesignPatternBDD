package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getProperties() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/resources/Testdata/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties=new Properties();
        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;

    }
}
