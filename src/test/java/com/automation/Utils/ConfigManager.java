package com.automation.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    static Properties pro;

    public static void initProperties(){
        pro = new Properties();
        try {
            pro.load(new FileInputStream("src/test/resources/Config/ConfigProperties.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getConfigPro(String key){
        return pro.getProperty(key);
    }

    public static void setConfigPro(String key,String val){
         pro.setProperty(key,val);
    }
}
