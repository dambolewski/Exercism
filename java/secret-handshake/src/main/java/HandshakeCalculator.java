import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> list = new ArrayList<>();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        String padding = String.format("%5s", binary).replace(' ', '0');
        System.out.println(padding);
        String[] split = padding.split("");
        if (split[split.length - 1].equals("1")) {
            list.add(Signal.WINK);
        }
        if (split[split.length - 2].equals("1")) {
            list.add(Signal.DOUBLE_BLINK);
        }
        if (split[split.length - 3].equals("1")) {
            list.add(Signal.CLOSE_YOUR_EYES);
        }
        if (split[split.length - 4].equals("1")) {
            list.add(Signal.JUMP);
        }
        if (split[split.length - 5].equals("1")) {
            Collections.reverse(list);
        }
        System.out.println(list);
        return list;
    }
}
