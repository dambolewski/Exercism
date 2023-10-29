class DoublyLinkedList<T> {

    private Element<T> head;
    private Element<T> tail;

    void push(T value) {
        Element<T> element = new Element<T>(value, tail, null);
        if (tail != null) {
            tail.next = element;
        }
        tail = element;
        if (head == null) {
            head = element;
        }
    }

    T pop() {
        if (tail == null) {
            return null; // Return null if the list is empty
        }
        Element<T> element = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return element.value;
    }

    void unshift(T value) {
        Element<T> element = new Element<T>(value, null, head);
        if (head != null) {
            head.prev = element;
        }
        head = element;
        if (tail == null) {
            tail = element;
        }
    }

    T shift() {
        if (head == null) {
            return null;
        }
        Element<T> element = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return element.value;
    }

    private static final class Element<T> {
        private final T value;
        private Element<T> prev;
        private Element<T> next;

        Element(T value, Element<T> prev, Element<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
