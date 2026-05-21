package utilites;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigUtility {

static Properties prop;

public static String getProperty(String key)
throws Exception {

prop=new Properties();

FileInputStream fis=
new FileInputStream(
"src/test/resources/config/config.properties");

prop.load(fis);

return prop.getProperty(key);

}
}