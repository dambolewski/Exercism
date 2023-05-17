import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Yacht {

    int[] dice;
    YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        switch (yachtCategory) {
            case ONES, TWOS, THREES, FOURS, FIVES, SIXES -> {
                return getNumbers(yachtCategory.ordinal());
            }
            case FULL_HOUSE -> {
                Map<Integer, Long> counts = getCounts();

                if (counts.size() == 2 && counts.containsValue(3L) && counts.containsValue(2L)) {
                    return Arrays.stream(dice).sum();
                } else {
                    return 0;
                }
            }
            case FOUR_OF_A_KIND -> {
                Map<Integer, Long> counts = getCounts();
                int value = 0;

                for (Map.Entry<Integer, Long> entry : counts.entrySet()) {
                    if (entry.getValue() >= 4) {
                        value = (entry.getKey() * 4);
                    }
                }
                return value;
            }
            case LITTLE_STRAIGHT -> {
                return isStraight(new int[]{1, 2, 3, 4, 5}) ? 30 : 0;
            }
            case BIG_STRAIGHT -> {
                return isStraight(new int[]{2, 3, 4, 5, 6}) ? 30 : 0;
            }
            case CHOICE -> {
                return Arrays.stream(dice).sum();
            }
            case YACHT -> {
                return isYacht() ? 50 : 0;
            }
            default -> {
                return 0;
            }
        }
    }

    private int getNumbers(int x) {
        return (int) Arrays.stream(dice)
                .filter(num -> num == x)
                .count() * x;
    }

    private Map<Integer, Long> getCounts() {
        return Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private boolean isStraight(int[] expectedValues) {
        return Arrays.equals(Arrays.stream(dice)
                .distinct()
                .sorted()
                .toArray(), expectedValues);
    }

    private boolean isYacht() {
        return Arrays.equals(Arrays.copyOfRange(dice, 1, dice.length), Arrays.copyOfRange(dice, 0, dice.length - 1));
    }

}
