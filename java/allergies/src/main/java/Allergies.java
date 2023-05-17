import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Allergies {
    int score;

    public Allergies(int score) {
        this.score = score;
    }

    public boolean isAllergicTo(Allergen allergen) {
        return ((allergen.getScore() & score) == allergen.getScore());
    }

    public Collection<Allergen> getList() {
        List<Allergen> matchedAllergens = new ArrayList<>();
        for (Allergen allergen : Allergen.values()) {
            if (isAllergicTo(allergen))
                matchedAllergens.add(allergen);
        }
        return matchedAllergens;
    }
}