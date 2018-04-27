package homeworks.level3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyBillPugh {

    private final Properties properties;

    private static class SingletonHelper {
        private static final PropertyBillPugh INSTANCE = new PropertyBillPugh();
    }

    public static PropertyBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private PropertyBillPugh() {
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
