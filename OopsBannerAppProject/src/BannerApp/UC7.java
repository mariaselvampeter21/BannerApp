package BannerApp;

import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * Displays the word "OOPS" in banner format using OOPS principles.
 */
public class UC7 {

    /**
     * Inner class to store character patterns
     */
    static class CharPattern {
        private String[] pattern;

        // Constructor
        public CharPattern(String[] pattern) {
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    // Class variable (static)
    private static Map<Character, CharPattern> patternMap = new HashMap<>();

    /**
     * Static method to initialize patterns
     */
    public static void initPatterns() {

        patternMap.put('O', new CharPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharPattern(new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharPattern(new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));
    }

    /**
     * Displays text in banner format
     */
    public static void displayBanner(String text) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                CharPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    /**
     * Main method – entry point
     */
    public static void main(String[] args) {
        initPatterns();
        displayBanner("OOPS");
    }
}
