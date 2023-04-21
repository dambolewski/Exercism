import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Robot {

    private static final String NAME_PATTERN = "[A-Z]{2}\\d{3}";
    private static final Random RANDOM = new Random();
    private static final Set<String> names = new HashSet<>();

    private String name;

    public Robot() {
        this.name = generateName();
    }

    public String getName() {
        return name;
    }

    public void reset() {
        names.remove(name);
        name = generateName();
    }

    private static String generateName() {
        String newName;
        do {
            newName = String.format("%c%c%d%d%d",
                    (char) (RANDOM.nextInt(26) + 'A'),
                    (char) (RANDOM.nextInt(26) + 'A'),
                    RANDOM.nextInt(10),
                    RANDOM.nextInt(10),
                    RANDOM.nextInt(10));
        } while (names.contains(newName));
         names.add(newName);
        return newName;
    }
}
