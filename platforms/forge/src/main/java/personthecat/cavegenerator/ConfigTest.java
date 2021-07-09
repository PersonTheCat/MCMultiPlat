package personthecat.cavegenerator;

import personthecat.buildtools.OverwriteClass;

import java.util.function.Supplier;

@OverwriteClass
public class ConfigTest {
    public static Supplier<String> DEMO = () -> "forge";
}
