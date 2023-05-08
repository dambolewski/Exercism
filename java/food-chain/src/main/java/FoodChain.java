public class FoodChain {

    private static final String[] ANIMALS = {"fly", "spider", "bird", "cat", "dog", "goat", "cow", "horse"};

    private static final String[] REASONS = {
            "",
            "It wriggled and jiggled and tickled inside her.",
            "How absurd to swallow a bird!",
            "Imagine that, to swallow a cat!",
            "What a hog, to swallow a dog!",
            "Just opened her throat and swallowed a goat!",
            "I don't know how she swallowed a cow!",
            "She's dead, of course!",
            " that wriggled and jiggled and tickled inside her"
    };

    private static final String SWALLOWED = "She swallowed the %s to catch the %s";
    private static final String FIRST_LINE_TEMPLATE = "I know an old lady who swallowed a %s.";
    private static final String ENDING_LINE = "I don't know why she swallowed the fly. Perhaps she'll die.";


    public String verse(int verse) {
        StringBuilder sb = new StringBuilder();

        if (verse == 1) {
            sb.append(String.format(FIRST_LINE_TEMPLATE, ANIMALS[verse - 1]))
                    .append(REASONS[verse - 1]).append("\n");
        } else {
            sb.append(String.format(FIRST_LINE_TEMPLATE, ANIMALS[verse - 1])).append("\n")
                    .append(REASONS[verse - 1]).append("\n");
        }
        if (verse == 8) {
            return sb.toString().trim();
        }

        for (int i = verse - 1; i > 0; i--) {
            sb.append(String.format(SWALLOWED, ANIMALS[i], ANIMALS[i - 1]));
            if (i == 2) {
                sb.append(REASONS[REASONS.length-1]);
            }
            sb.append(".\n");
        }
        sb.append(ENDING_LINE);

        return sb.toString();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder builder = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            builder.append(verse(i)).append("\n\n");
        }
        return builder.toString().trim();
    }
}