/**
 * To execute this application, run the following command
 * java -cp "/home/cddrm/.m2/repository/info/picocli/picocli/4.5.2/picocli-4.5.2.jar:/home/cddrm/sandbox/java-skill-launch/command-line-test/target/command-line-test-1.0-SNAPSHOT.jar" subcommand_example.ISOCodeResolver country fr
 * Format: java -cp "{Absolute paths of all required jars separated by colons}" <Main Class> <Subcommands>
 * After setting an alias for the long command, you can run the command as:
 * ISOCodeResolver language de cs en sd se
 * or
 * ISOCodeResolver country cn fr th ro no
 */

package subcommand_example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Parameters;
// import picocli.CommandLine.ParameterException;
import picocli.CommandLine.Spec;
import java.util.Locale;

@Command(name = "ISOCodeResolver",
        subcommands = { SubcommandAsClass.class, CommandLine.HelpCommand.class },
        description = "Resolves ISO country codes (ISO-3166-1) or language codes (ISO 639-1/-2)")
public class ISOCodeResolver {
    @Spec CommandSpec spec;

    @Command(name = "country", description = "Resolves ISO country codes (ISO-3166-1)")
    void subCommandViaMethod(
            @Parameters(arity = "1..*", paramLabel = "<countryCode>",
                    description = "country code(s) to be resolved") String[] countryCodes) {

        for (String code : countryCodes) {
            System.out.printf("%s: %s",
                    code.toUpperCase(), new Locale("", code).getDisplayCountry());
        }
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ISOCodeResolver()).execute(args);
        System.exit(exitCode);
    }
}

@Command(name = "language",
        description = "Resolves one ore more ISO language codes (ISO-639-1 or 639-2)")
class SubcommandAsClass implements Runnable {

    @Parameters(arity = "1..*", paramLabel = "<languageCode>", description = "language code(s)")
    private String[] languageCodes;

    @Override
    public void run() {
        for (String code : languageCodes) {
            System.out.printf("%s: %s",
                    code.toLowerCase(), new Locale(code).getDisplayLanguage());
        }
    }
}