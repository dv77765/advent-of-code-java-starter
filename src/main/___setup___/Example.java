package src.main.___setup___;

import java.lang.invoke.MethodHandles;

public class Example extends Runner {
    private static Runner runner = new Example(); // Note: Change to current class

    public static void main(String[] args) {
        runner.run(MethodHandles.lookup().lookupClass().getSimpleName());
    }

    @Override
    public String part1(String[] input) {
        return null;
    }

    @Override
    public String part2(String[] input) {
        return null;
    }
}