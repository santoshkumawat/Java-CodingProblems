import java.util.LinkedHashSet;

/**
 * Removes duplicate elements from the given array and returns an array with unique elements.
 * <p>
 * Input: [10, 20, 10, 30, 20, 30, 40]
 * Output: [10,20,30,40]
 * <p>
 * With time and space complexity
 */

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 30, 40};

        int arrLength = arr.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arrLength; i++) {
            set.add(arr[i]);
        }

        int[] tempArr = new int[set.size()];
        int j = 0;
        for (int i : set) {
            tempArr[j] = i;
            j++;
        }

        for (int i : tempArr) {
            System.out.println(i);
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)