public class Hamming {

    String leftStrand;
    String rightStrand;

    
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == 0 && rightStrand.length() != 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (leftStrand.length() != 0 && rightStrand.length() == 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        }
    }

    public int getHammingDistance() {
        int counter = 0;

        char[] left = leftStrand.toCharArray();
        char[] right = rightStrand.toCharArray();
        for (int i = 0; i < leftStrand.length(); i++) {
            if (left[i] != right[i])
                counter++;
        }
        return counter;
    }
}