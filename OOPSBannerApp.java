import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    
    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();
        // Pattern for O
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

       
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for S
        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void printBanner(String text, Map<Character, String[]> patterns) {

        int height = 5; 

        
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            
            for (char ch : text.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = getCharacterPatterns();

        String word = "OOPS";

        printBanner(word, patterns);
    }
}