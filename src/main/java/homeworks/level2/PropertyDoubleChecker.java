package homeworks.level2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyDoubleChecker {

    private static PropertyDoubleChecker ourInstance;

    private final Properties properties;

    public static PropertyDoubleChecker getInstance() {
        if (ourInstance == null) {
            synchronized (PropertyDoubleChecker.class) {
                if (ourInstance == null) {
                    ourInstance = new PropertyDoubleChecker();
                }
            }
        }
        return ourInstance;
    }

    public PropertyDoubleChecker() {
        properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/test.properties");
            properties.load(input);
            properties.list(System.out);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getProperty(String propertyKey) {
        return properties.getProperty(propertyKey, null);
    }
}
