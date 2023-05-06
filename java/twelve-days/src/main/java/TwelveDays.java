import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    private final Map<Integer, String> map = new HashMap<>();
    private final String[] gifts = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};
    private final String[] numbers = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    String verse(int verseNumber) {
        createMap(map);
        return map.get(verseNumber);
    }

    String verses(int startVerse, int endVerse) {
        createMap(map);
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i < endVerse; i++) {
            sb.append(map.get(i)).append("\n");
        }
        sb.append(map.get(endVerse));
        return sb.toString();
    }

    String sing() {
        createMap(map);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 12; i++) {
            sb.append(map.get(i)).append("\n");
        }
        sb.append(map.get(12));
        return sb.toString();
    }

    private void createMap(Map<Integer, String> map) {
        if (map.isEmpty()) {
            for (int i = 0; i < 12; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("On the ").append(numbers[i]).append(" day of Christmas my true love gave to me: ");
                for (int j = i; j >= 0; j--) {
                    if (j == 0 && i != 0) {
                        sb.append("and ");
                    }
                    sb.append(gifts[j]);
                    if (j != 0) {
                        sb.append(", ");
                    }
                }
                sb.append(".\n");
                map.put(i + 1, sb.toString());
            }
        }
    }
}
