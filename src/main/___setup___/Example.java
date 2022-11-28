package src.main.___setup___;

import java.lang.invoke.MethodHandles;
import java.util.List;

public class Example extends Runner {
    private static Runner runner = new Example(); // Note: Change to current class

    public static void main(String[] args) {
        runner.run(MethodHandles.lookup().lookupClass().getSimpleName());
    }

    @Override
    public String part1(List<String> input) {
        return null;
    }

    @Override
    public String part2(List<String> input) {
        return null;
    }
}