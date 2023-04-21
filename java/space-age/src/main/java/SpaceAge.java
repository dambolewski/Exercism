import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

class SpaceAge {
    private static double age;

    public SpaceAge(double seconds) {
        this.age = seconds;
    }

    double getSeconds() {
        return age;
    }

    double onEarth() {
        return calculate(age,31557600);
    }

    private static double calculate(double a, double b) {
        double ageOnEarth = a / b;
        DecimalFormat df = new DecimalFormat("0.00");
        NumberFormat nf = NumberFormat.getInstance();
        try {
            return nf.parse(df.format(ageOnEarth)).doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    double onMercury() {
        return calculate(onEarth(),0.2408467);
    }

    double onVenus() {
        return calculate(onEarth(),0.61519726);
    }

    double onMars() {
        return calculate(onEarth(),1.8808158);
    }

    double onJupiter() {
        return calculate(onEarth(),11.862615);
    }

    double onSaturn() {
        return calculate(onEarth(),29.447498);
    }

    double onUranus() {
        return calculate(onEarth(),84.016846);
    }

    double onNeptune() {
        return calculate(onEarth(),164.79132);
    }

}
