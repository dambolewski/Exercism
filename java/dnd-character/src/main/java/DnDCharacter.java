import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    Random random = new Random();
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int constitution;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.constitution = ability(rollDice());
    }


    int ability(List<Integer> scores) {
        List<Integer> copy = new ArrayList<>(scores);
        int smallest = 1;
        int index = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) <= smallest) index = i;
        }
        copy.remove(index);
        return copy.stream().mapToInt(a -> a).sum();
    }

    List<Integer> rollDice() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(random.nextInt(6) + 1);
        }
        return list;
    }

    int modifier(int input) {
        double mod = (input - 10) / 2.0;
        return (int) Math.floor(mod);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
