package com.Nataliia.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- Create the object of Properties class
    // We need properties class to use methods coming from class lice load(), getProperty("key")

    private static Properties properties = new Properties();

    // We want to open the properties file and load to properties object only before reading
    // having static block because static runs first!!!

    static{
        try {
            // 2-  Create the object of fileInputStream
            //We need this object to open file as a stream in java memory

            FileInputStream file = new FileInputStream("configuration.properties");

            // 3-Load the properties object using FileInputStream object
            // Load "properties" object with the "file

            properties.load(file);

            // close the file after loading
            // if do not close the file, it will take space from computer memory like scanner

            file.close();
        }catch(IOException e) {
            e.printStackTrace();

        }
    }

    //This method is used to read value from a configuration.properties file
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
