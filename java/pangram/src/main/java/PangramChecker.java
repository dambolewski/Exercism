import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if( input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!alphaList[i]) {
                flag = 0;
                break;
            }
        }
        return flag == 1;
    }

}
