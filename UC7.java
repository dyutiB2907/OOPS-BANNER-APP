public class UC7 {

    // Static Inner Class to store Character and Pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Store patterns in array
        CharacterPatternMap[] patterns = {O, O, P, S};

        int rows = 5;

        // Print banner horizontally
        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}