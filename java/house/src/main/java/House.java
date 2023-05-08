public class House {

    private final String[] THINGS = new String[]{
            "house", "malt", "rat", "cat", "dog", "cow with the crumpled horn", "maiden all forlorn",
            "man all tattered and torn", "priest all shaven and shorn", "rooster that crowed in the morn",
            "farmer sowing his corn", "horse and the hound and the horn"
    };
    private final String[] VERBS = new String[]{
            "that lay in the", "that ate the", "that killed the", "that worried the",
            "that tossed the", "that milked the",
            "that kissed the", "that married the",
            "that woke the", "that kept the", "that belonged to the"
    };
    private final String THIS_IS = "This is the ";
    private final String JACK_BUILT = " that Jack built.";

    public String verse(int number) {
        String currentVerse = THIS_IS + THINGS[0] + JACK_BUILT;

        for (int i = 1; i <= number - 1; i++) {
            currentVerse = THIS_IS + THINGS[i] + " " + VERBS[i-1] + " " + currentVerse.substring(12);
        }
        return currentVerse;
    }

    public String sing() {
        StringBuilder songBuilder = new StringBuilder();
        for (int i = 1; i <= THINGS.length; i++) {
            songBuilder.append(verse(i)).append("\n");
        }
        return songBuilder.toString().trim();
    }

    public String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            sb.append(verse(i)).append("\n");
        }
        return sb.toString().trim();
    }
}