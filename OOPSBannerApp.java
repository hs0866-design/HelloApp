import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Method to create and store banner patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "** **",
                "** **",
                "** **",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "** **",
                "**** ",
                "**   ",
                "**   "
        });

        map.put('S', new String[]{
                " ****",
                "**   ",
                " *** ",
                "   **",
                "**** "
        });

        return map;
    }

    // Method to display banner message
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : message.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}