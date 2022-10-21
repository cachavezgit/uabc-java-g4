package mx.uabc.cursojava.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LeerPropertiesFile {
    public static void PrintOutProperties(FileInputStream fileStream) throws IOException{
        Properties properties = new Properties();
        properties.load(fileStream);

        System.out.println("name: " + properties.getProperty("name"));
        System.out.println("family name: " + properties.getProperty("familyName"));
        System.out.println("nick: " + properties.getProperty("userName"));
        System.out.println("age: " + properties.getProperty("age"));
        System.out.println("background color: " + properties.getProperty("bgColor"));
    }

    public static void main(String[] args) throws IOException {
        String pathString = "C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\inputoutput\\demo.properties";

        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(pathString);
            PrintOutProperties(fileStream);
        } catch (FileNotFoundException fnfe) {
            System.out.println("WARNING: could not find the properties file");
        } catch (IOException ioe) {
            System.out.println("WARNING: problem processing the properties file");
        } finally {
            if (fileStream != null) {
                fileStream.close();
            }
        }
    }
}
