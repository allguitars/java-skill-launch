package map.properties_examples;

// Properties --> HashTable - - -> Map interface

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileDemo {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        // Path from repository root
        props.load(new FileInputStream("snippets/src/main/resources/person.properties"));

        System.out.println(props.getProperty("org.cddrm.username"));
        System.out.println(props.getProperty("org.cddrm.password"));
    }
}
