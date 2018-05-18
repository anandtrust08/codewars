package io.pello.codewars.searchinsert;

public class SearchInsert {
    public int searchInsertPosition(int[] numbers, int target) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        
        while (lowIndex <= highIndex) {
            int middle = (lowIndex + highIndex) / 2;
            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] > target) {
                highIndex = middle - 1;
            } else {
                lowIndex = middle + 1;
            }
        }
        return lowIndex;
    }
}
