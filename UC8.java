import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to initialize patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner word
    public static void renderBanner(String word) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        renderBanner("OOPS");
    }
}