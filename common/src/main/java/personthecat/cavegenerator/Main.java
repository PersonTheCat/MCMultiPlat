package personthecat.cavegenerator;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import personthecat.fresult.Result;

public class Main {

    public static final Block block = Blocks.BONE_BLOCK;

    public static void readMissing() {
        final String result = Result.<String, RuntimeException>of(() -> { throw new RuntimeException("oops"); })
            .ifErr(System.out::println)
            .orElse("I did it!");
//        Level level = null; // compile check
        final String missing = OverwriteValues.MISSING.get();
    }
}
