public class QueenAttackCalculator {
    Queen queen1;
    Queen queen2;

    public QueenAttackCalculator(Queen queen1, Queen queen2) {
        if (queen1 == null || queen2 == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        if (queen1.x == queen2.x && queen1.y == queen2.y)
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        this.queen1 = queen1;
        this.queen2 = queen2;
    }

    public boolean canQueensAttackOneAnother() {
        return queen1.x == queen2.x || queen1.y == queen2.y || Math.abs(queen1.x - queen2.x) == Math.abs(queen1.y - queen2.y);
    }
}
