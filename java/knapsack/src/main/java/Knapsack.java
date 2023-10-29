import java.util.*;

public class Knapsack {

    public int maximumValue(int capacity, List<Item> items) {
        int[][] dataArray = new int[capacity + 1][items.size() + 1];
        return knapsackHelper(capacity, items, 0, dataArray);
    }

    public int knapsackHelper(int capacity, List<Item> items, int index, int[][] dataArrayMemo) {
        if (capacity == 0 || index == items.size()) {
            return 0;
        }
        if (dataArrayMemo[capacity][index] != 0) {
            return dataArrayMemo[capacity][index];
        }
        Item currentItem = items.get(index);
        int valueWithoutItem = knapsackHelper(capacity, items, index + 1, dataArrayMemo);
        int valueWithItem = 0;
        if (currentItem.weight <= capacity) {
            valueWithItem = currentItem.value + knapsackHelper(capacity - currentItem.weight, items, index + 1, dataArrayMemo);
        }
        int maxValue = Math.max(valueWithoutItem, valueWithItem);
        dataArrayMemo[capacity][index] = maxValue;
        return maxValue;
    }
}