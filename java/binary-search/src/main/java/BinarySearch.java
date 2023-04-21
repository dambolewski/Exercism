import java.util.*;

class BinarySearch {

    List<Integer> sortedList;

    public BinarySearch(List<Integer> sortedList) {
        this.sortedList = sortedList.stream().sorted().toList();
    }

    //Using Collections to do binary search
    /*public int indexOf(int i) throws ValueNotFoundException {
        int index = Collections.binarySearch(sortedList, i);
        if (index < 0) {
            throw new ValueNotFoundException("Value not in array");
        }
        return index;
    }*/

    //Using algorithm to do binary search
    public int indexOf(int i) throws ValueNotFoundException {
        int low = 0;
        int high = sortedList.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = sortedList.get(mid);

            if (midVal < i) {
                low = mid + 1;
            } else if (midVal > i) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        throw new ValueNotFoundException("Value not in array");
    }

}
