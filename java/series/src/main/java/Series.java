import java.util.ArrayList;
import java.util.List;

class Series {
    String string;

    Series(String string) {
        this.string = string;
    }

    List<String> slices(int num) {
        List<String> list = new ArrayList<>();
        if(num < 0 || num == 0)
            throw new IllegalArgumentException("Slice size is too small.");
        if (num > string.length())
            throw new IllegalArgumentException("Slice size is too big.");

        for (int i = 0; i < string.length() - (num - 1); i++) {
            list.add(string.substring(i,i+num));
        }

        return list;
    }
}
