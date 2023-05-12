import java.util.*;

public class Knapsack {

    public int maximumValue(int capacity, List<Item> items) {
        int[][] dataArray = new int[capacity + 1][items.size() + 1];
        return knapsackHelper(capacity, items, 0, dataArray);
    }

    private int knapsackHelper(int capacity, List<Item> items, int index, int[][] dataArrayMemo) {
        //checks if the remaining capacity is 0 or the index is equal to the size of the item list
        //if true -> there are no more items to consider or the knapsack is full, so the method returns zero
        if (capacity == 0 || index == items.size()) {
            return 0;
        }
        //checks if the solution for the current sub-problem has already been computed and stored in the memoization map
        //if yes -> the method simply returns the stored solution.
        if (dataArrayMemo[capacity][index] != 0) {
            return dataArrayMemo[capacity][index];
        }
        //current item being considered and computes the maximum value that can be obtained without including this item
        //(by recursively calling itself with the next item and the same capacity)
        Item currentItem = items.get(index);
        int valueWithoutItem = knapsackHelper(capacity, items, index + 1, dataArrayMemo);
        //maximum value that can be obtained by including the current item
        //(by recursively calling itself with the next item and the remaining capacity reduced by the weight
        // of the current item, and adding the value of the current item to the result)
        int valueWithItem = 0;
        if (currentItem.getWeight() <= capacity) {
            valueWithItem = currentItem.getValue() + knapsackHelper(capacity - currentItem.getWeight(), items, index + 1, dataArrayMemo);
        }
        //The method returns the maximum value computed in step 4 and stores it in the memoization map
        // for future reference.
        int maxValue = Math.max(valueWithoutItem, valueWithItem);
        dataArrayMemo[capacity][index] = maxValue;

        return maxValue;
    }
}

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}

