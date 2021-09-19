package map.properties_examples;

// Usage: set system properties while running the application
// Run the following command under xxx/src/main/java folder
// java -Dusername=dave -Dpassword=1234 map.properties.SystemPropertiesDemo


import java.util.Properties;

public class SystemPropertiesDemo {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }
}
