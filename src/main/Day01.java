package src.main;

import java.lang.invoke.MethodHandles;

import src.main.___setup___.Runner;

public class Day01 extends Runner {
    private static Runner runner = new Day01(); // Note: Change to current class

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