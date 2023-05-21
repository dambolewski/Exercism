import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    private final List<Integer> rolls = new ArrayList<>();

    public void roll(int pins) {
        validatePreRolls(pins);
        rolls.add(pins);
        validatePostRolls();
    }

    public int score() {
        int totalScore = 0;
        int frameIndex = 0;
        int rollsLength = rolls.size();

        for (int frame = 0; frame < 10; frame++) {
            if (frameIndex >= rollsLength) {
                throw new IllegalStateException("Score cannot be taken until the end of the game");
            }
            int roll1 = rolls.get(frameIndex);
            if (roll1 == 10) {
                totalScore += roll1;
                if (frameIndex + 2 < rollsLength) {
                    int roll2 = rolls.get(frameIndex + 1);
                    int roll3 = rolls.get(frameIndex + 2);
                    totalScore += roll2 + roll3;
                } else {
                    throw new IllegalStateException("Score cannot be taken until the end of the game");
                }
                frameIndex += 1;
            } else {
                if (frameIndex + 1 < rollsLength) {
                    int roll2 = rolls.get(frameIndex + 1);
                    int frameScore = roll1 + roll2;
                    if (frameScore == 10) {
                        if (frameIndex + 2 < rollsLength) {
                            int roll3 = rolls.get(frameIndex + 2);
                            frameScore += roll3;
                        } else {
                            throw new IllegalStateException("Score cannot be taken until the end of the game");
                        }
                    }
                    totalScore += frameScore;
                }
                frameIndex += 2;
            }
        }
        return totalScore;
    }

    private void validatePreRolls(int pins) {
        if (pins < 0)
            throw new IllegalStateException("Negative roll is invalid");
        if (pins > 10)
            throw new IllegalStateException("Pin count exceeds pins on the lane");
    }

    private void validatePostRolls() {
        int currentIndex = 0;
        while (currentIndex < rolls.size()) {
            if (currentIndex == 18 && rolls.get(18) == 10 && rolls.size() == 21) {
                if (rolls.get(19) + rolls.get(20) > 10) {
                    if (rolls.get(19) != 10)
                        throw new IllegalStateException("Pin count exceeds pins on the lane");
                }
            }
            if (currentIndex < rolls.size() - 1) {
                int roll1 = rolls.get(currentIndex);
                int roll2 = rolls.get(currentIndex + 1);
                if (roll1 + roll2 > 10 && roll1 != 10 && roll2 != 10) {
                    throw new IllegalStateException("Pin count exceeds pins on the lane");
                }
            }
            currentIndex += 2;
        }

        if (rolls.size() > 21) {
            throw new IllegalStateException("Cannot roll after game is over");
        }
        if (rolls.size() >= 20 && rolls.get(18) != 10 && rolls.get(19) != 10 && (rolls.get(18) + rolls.get(19) < 10)) {
            if (rolls.size() > 20) {
                throw new IllegalStateException("Cannot roll after game is over");
            }
        }
    }
}
