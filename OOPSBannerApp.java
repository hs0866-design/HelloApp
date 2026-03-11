public class OOPSBannerApp {

    // Inner class to store character pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Print banner
    public static void printBanner(CharacterPattern[] letters) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern letter : letters) {
                line.append(letter.getPattern()[row]).append("   ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            " **** ",
            "**  **",
            "**  **",
            "**  **",
            "**  **",
            "**  **",
            " **** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "******",
            "**  **",
            "**  **",
            "******",
            "**    ",
            "**    ",
            "**    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ******",
            "**     ",
            "**     ",
            " ***** ",
            "     **",
            "     **",
            "****** "
        });

        CharacterPattern[] banner = {O, O, P, S};

        printBanner(banner);
    }
}