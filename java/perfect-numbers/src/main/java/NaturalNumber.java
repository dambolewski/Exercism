import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {

    private final int naturalNumber;

    public NaturalNumber(int i) {
        if(i <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.naturalNumber = i;
    }

    public Classification getClassification() {
        List<Integer> dividers = new ArrayList<>();
        for (int i = 1; i < naturalNumber; i++) {
            if (naturalNumber % i == 0) {
                dividers.add(i);
            }
        }
        int sum = dividers.stream().mapToInt(Integer::intValue).sum();
        if (sum == naturalNumber)
            return Classification.PERFECT;
        else if (sum > naturalNumber)
            return Classification.ABUNDANT;
        else
            return Classification.DEFICIENT;
    }
}
