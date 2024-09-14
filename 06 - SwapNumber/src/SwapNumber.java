/**
 * Write a program that swaps two numbers using both methods:
 * with a third variable and without a third variable.
 *
 * Input: a = 5, b = 10
 * Output (with third variable): a = 10, b = 5
 * Output (without third variable): a = 10, b = 5
 *
 * With time and space complexity
 */

public class SwapNumber {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before Swap (with third variable): a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After Swap (with third variable): a = " + a + ", b = " + b);

        // Resetting values
        a = 5;
        b = 10;

        // Swapping without using a third variable
        System.out.println("Before Swap (without third variable): a = " + a + ", b = " + b);
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10
        System.out.println("After Swap (without third variable): a = " + a + ", b = " + b);
    }

}

// Time Complexity: O(1) for both methods.
// Space Complexity: O(1) for both methods.