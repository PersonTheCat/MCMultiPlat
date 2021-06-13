package personthecat.cavegenerator;

import personthecat.buildtools.OverwriteClass;
import java.util.function.Supplier;

@OverwriteClass
public class OverwriteValues {
//    public static final int CONSTANT_1 = 1;
//    public static final String CONSTANT_2 = "3";
    private static final String MISSING_VALUE = "Not present in Fabric";

    public static final Supplier<String> MISSING = () -> MISSING_VALUE;

    public static class Nested {
        public static String getOtherMissing() {
            return "Also missing in Fabric";
        }
    }
}
