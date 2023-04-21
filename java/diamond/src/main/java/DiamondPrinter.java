import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    public List<String> printToList(char a) {
        List<String> list = new ArrayList<>();
        int input = a - 'A' + 1;
        int index = input - 1;
        int midIndex = 0;
        int letterIndex = 0;

        int index2 = input - (input - 1);
        int midIndex2 = 0;
        int letterIndex2 = 1;

        //top loop
        for (int i = 1; i <= input; i++) {
            String sb;
            if (midIndex == 0) {
                sb = " ".repeat(index) +
                        (char) ('A' + letterIndex) +
                        " ".repeat(index);
                midIndex++;
            } else {
                sb = " ".repeat(index) +
                        (char) ('A' + letterIndex) +
                        " ".repeat(midIndex) +
                        (char) ('A' + letterIndex) +
                        " ".repeat(index);
                midIndex2 = midIndex;
                midIndex += 2;
            }
            letterIndex++;
            index--;
            list.add(sb);
        }

        //first half ends with max midIndex of spaces -> for 'C' its 3.
        //Start of bottom half starts with 1 so (midIndex - 2);
        midIndex2 -= 2;

        //bottom loop
        for (int i = input - 1; i > 0; i--) {
            String sb;
            if (midIndex2 > 0) {
                sb = " ".repeat(index2) +
                        (char) (a - letterIndex2) +
                        " ".repeat(midIndex2) +
                        (char) (a - letterIndex2) +
                        " ".repeat(index2);
                midIndex2 = midIndex2 - 2;
            } else {
                sb = " ".repeat(index2) +
                        (char) (a - letterIndex2) +
                        " ".repeat(index2);
            }
            index2++;
            letterIndex2++;
            list.add(sb);
        }
        return list;
    }
}