package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private Properties properties = new Properties();

    public ConfigManager(String filePath){
        try (FileInputStream fis = new FileInputStream(filePath)){
            properties.load(fis);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Fail to load properties file" + filePath);
        }
    }

    public String getProperty(String key){
        return properties.getProperty(key);

    }
}
