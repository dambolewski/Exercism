import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;
    private final Set<Double> sides = new HashSet<>();

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (!validSides()) {
            throw new TriangleException();
        }
        sides.addAll(Stream.of(side1, side2, side3).collect(Collectors.toSet()));
    }

    boolean isEquilateral() {
        return sides.size() == 1;
    }

    boolean isIsosceles() {
        return sides.size() <= 2;
    }

    boolean isScalene() {
        return sides.size() == 3;
    }

    private boolean validSides() {
        return checkLengths() && triangleCondition();
    }

    private boolean checkLengths() {
        return side1 > 0 && side2 > 0 && side3 > 0;
    }

    private boolean triangleCondition() {
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }
}
