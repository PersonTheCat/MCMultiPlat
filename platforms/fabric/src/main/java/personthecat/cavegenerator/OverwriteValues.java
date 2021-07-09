package personthecat.cavegenerator;

import personthecat.buildtools.OverwriteClass;
import java.util.function.Supplier;

// Commenting these values out should demonstrate expected failure
@OverwriteClass
public class OverwriteValues {
    public static final int CONSTANT_1 = 1;
//    public static final String CONSTANT_2 = "3";
    private static final String MISSING_VALUE = "Updated in Fabric";

    public static final Supplier<String> MISSING = () -> MISSING_VALUE;

    public static class Nested {
        public static String getOtherMissing() {
            return "Also updated in Fabric";
        }
    }
}
