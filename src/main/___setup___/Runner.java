package src.main.___setup___;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Runner {
    public abstract String part1(String[] input);

    public abstract String part2(String[] input);

    public void run(String day) {
        Map<String, String[]> inputs = loadInputs(
                String.format("%s\\src\\resources\\%s", System.getProperty("user.dir"), day));

        System.out.printf("\nRunning %s...\n", day);
        for (String key : inputs.keySet()) {
            System.out.printf("\n============================== %s ==============================\n", key);
            System.out.printf("Part 1 =>\n%s\n\n", resolveResult(part1(inputs.get(key))));
            System.out.printf("Part 2 =>\n%s\n", resolveResult(part2(inputs.get(key))));
            System.out
                    .println(("==============================  ==============================" + key).replaceAll(".",
                            "="));
            System.out.println();
        }
    }

    private static String[] loadInput(File file) {
        try (BufferedReader r = new BufferedReader(new FileReader(file))) {
            return r.lines().toArray(String[]::new);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static Map<String, String[]> loadInputs(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        Map<String, String[]> inputs = new LinkedHashMap<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                String[] content = loadInput(file);
                inputs.put(file.getName(), content);
            }
        }
        return inputs;
    }

    private static String resolveResult(String result) {
        if (result == null || result.isEmpty()) {
            return "Not implemented";
        }
        return result;
    }
};
