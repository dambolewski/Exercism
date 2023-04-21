import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Flattener {

    public Flattener() {
    }

    public <T> List<T> flatten(List<Object> nestedList) {
        List<T> flattenedList = new ArrayList<>();
        LinkedList<Object> stack = new LinkedList<>(nestedList);
        while (!stack.isEmpty()) {
            Object element = stack.removeFirst();
            if (element != null) {
                if (element instanceof List) {
                    List<Object> list = (List<Object>) element;
                    for (int i = list.size() - 1; i >= 0; i--) {
                        stack.addFirst(list.get(i));
                    }
                } else {
                    flattenedList.add((T) element);
                }
            }
        }
        return flattenedList;
    }
}
